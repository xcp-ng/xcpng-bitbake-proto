DEPENDS ?= ""
PACKAGE_NEEDS_BOOTSTRAP ?= "0"

DEPLOY_DIR_ISARPM = "${DEPLOY_DIR}/rpms"

UPSTREAM_RPM_CACHEDIR = "${DL_DIR}/upstream"

# FIXME: xcp-ng-dev commands should be provided by build-env.class
XCPNGDEV = "${DEPLOY_DIR}/build-env/bin/xcp-ng-dev"


BUILDDEPS_MANAGED_REPONAME = "bdeps-managed"
BUILDDEPS_MANAGED = "${WORKDIR}/${BUILDDEPS_MANAGED_REPONAME}"

# Subset of DEPENDS for which we only need the RPMs built by the recipe
# (plus its rdeps-extra), not its full runtime closure.  This lets us build against a recipe before its
# runtime deps are resolved, which breaks build/runtime loops (e.g.
# xcp-featured builds against xapi-*-devel, while xapi-core Requires
# xcp-featured).  Runtime deps of the RPMs used that are built by other
# recipes must then come from other DEPENDS.
DEPENDS_RPMS_ONLY ?= ""

do_collect_managed_builddeps() {
    rm -rf "${BUILDDEPS_MANAGED}"
    mkdir -p "${BUILDDEPS_MANAGED}"
    for dep in ${DEPENDS}; do
        mkdir -p ${BUILDDEPS_MANAGED}/${dep}
        rpmdirs="RPMS rdeps-extra rdeps-managed rdeps-upstream"
        case " ${DEPENDS_RPMS_ONLY} " in
            *" $dep "*) rpmdirs="RPMS rdeps-extra" ;;
        esac
        for rpmdir in $rpmdirs; do
            if [ -d "${DEPLOY_DIR_ISARPM}/$dep/$rpmdir" ]; then
                cp -la "${DEPLOY_DIR_ISARPM}/$dep/$rpmdir" "${BUILDDEPS_MANAGED}/${dep}/"
            fi
        done
    done
    #createrepo_c --compatibility "${BUILDDEPS_MANAGED}"
}
addtask do_collect_managed_builddeps after do_unpack
do_collect_managed_builddeps[vardepsexclude] += "PACKAGE_EXTRA_ARCHS BB_TASKDEPDATA"

# Would otherwise be do_collect_managed_builddeps[deptask] = "do_deploy",
# but DEPENDS_RPMS_ONLY entries must only wait for do_deploy_rpms.
python() {
    deps = d.getVar("DEPENDS").split()
    rpms_only = d.getVar("DEPENDS_RPMS_ONLY").split()
    unknown = set(rpms_only) - set(deps)
    if unknown:
        bb.fatal(f"DEPENDS_RPMS_ONLY entries not in DEPENDS: {' '.join(sorted(unknown))}")
    taskdeps = ' '.join(f"{dep}:{'do_deploy_rpms' if dep in rpms_only else 'do_deploy'}"
                        for dep in deps)
    d.setVarFlag("do_collect_managed_builddeps", "depends", taskdeps)
}


## FIXME: hack to rely on RPMs from Fedora etc until they reach EPEL10
# URLs of RPMs not yet in our official upstream
EXTRA_UPSTREAM_DEPENDS = ""

BUILDDEPS_EXTRA_REPONAME = "bdeps-extra"
BUILDDEPS_EXTRA = "${WORKDIR}/${BUILDDEPS_EXTRA_REPONAME}"

do_fetch_extra_upstream_builddeps() {
    rm -rf "${BUILDDEPS_EXTRA}"
    mkdir -p "${BUILDDEPS_EXTRA}"
    for url in ${EXTRA_UPSTREAM_DEPENDS}; do
        rpm=$(basename "$url")
        if [ ! -e "${UPSTREAM_RPM_CACHEDIR}/$rpm" ]; then
            mkdir -p "${UPSTREAM_RPM_CACHEDIR}"
            curl --silent --show-error --fail --location \
                 --output-dir "${UPSTREAM_RPM_CACHEDIR}" --remote-name "$url"
        fi
        cp -l "${UPSTREAM_RPM_CACHEDIR}/$rpm" "${BUILDDEPS_EXTRA}/"
    done
}
do_fetch_extra_upstream_builddeps[network] = "1"

# only create this task if needed
python() {
    if d.getVar("EXTRA_UPSTREAM_DEPENDS"):
        bb.build.addtask("do_fetch_extra_upstream_builddeps", "do_collect_managed_builddeps", "do_unpack", d)
        BUILDDEPS_EXTRA = d.getVar("BUILDDEPS_EXTRA")
        BUILDDEPS_EXTRA_REPONAME = d.getVar("BUILDDEPS_EXTRA_REPONAME")
        d.setVar("EXTRA_BUILD_FLAGS", f"--local-repo='{BUILDDEPS_EXTRA}' --enablerepo='{BUILDDEPS_EXTRA_REPONAME}'")
    else:
        d.setVar("EXTRA_BUILD_FLAGS", "")
}


BUILDDEPS_UPSTREAM_REPONAME = "bdeps-upstream"
BUILDDEPS_UPSTREAM = "${WORKDIR}/${BUILDDEPS_UPSTREAM_REPONAME}"

# FIXME: managed RPM pulled by an upstream one will be missed
# FIXME: may need "rpmbuild -bd" as well for dynamic builddeps
do_fetch_upstream_builddeps() {
    BASE_S=$(basename ${S})
    SPEC=SPECS/${PN}.spec
    SOURCES=SOURCES
    [ -r "${S}/$SPEC" ] || { SPEC=${PN}.spec; SOURCES=.; }
    [ -r "${S}/$SPEC" ] || bbfatal "Cannot find ${PN}.spec"

    # FIXME should be an anynomous python block not copypasta
    case ${PACKAGE_NEEDS_BOOTSTRAP} in
    0) maybe_bootstrap=--isarpm ;;
    1) maybe_bootstrap=--bootstrap ;;
    esac

    URLS=$(
        env XCPNG_OCI_RUNNER=podman ${XCPNGDEV} container run \
                $maybe_bootstrap \
                --platform "${CONTAINER_ARCH}" \
                --debug \
                --local-repo="${BUILDDEPS_MANAGED}" --enablerepo="${BUILDDEPS_MANAGED_REPONAME}" \
                ${EXTRA_BUILD_FLAGS} \
                --no-update --disablerepo=xcpng \
                -d "${S}" \
                -v ${LAYERDIR_isarpm}/libexec/get-build-deps-urls.sh:/external/get-build-deps-urls.sh \
            "9.0" \
            -- /external/get-build-deps-urls.sh /external/${BASE_S}/${SPEC} /external/${BASE_S}/$SOURCES /external/${BASE_S}
    )

    rm -rf "${BUILDDEPS_UPSTREAM}"
    mkdir -p "${BUILDDEPS_UPSTREAM}"
    for url in $URLS; do
        case "$url" in
            file://*) continue ;; # skip files we provide in local repos
        esac
        rpm=$(basename "$url")
        if [ ! -e "${UPSTREAM_RPM_CACHEDIR}/$rpm" ]; then
            mkdir -p "${UPSTREAM_RPM_CACHEDIR}"
            curl --silent --show-error --fail --location \
                 --output-dir "${UPSTREAM_RPM_CACHEDIR}" --remote-name "$url"
        fi
        cp -l "${UPSTREAM_RPM_CACHEDIR}/$rpm" "${BUILDDEPS_UPSTREAM}/"
    done
}
do_fetch_upstream_builddeps[network] = "1"
do_fetch_upstream_builddeps[depends] = "build-env:do_deploy build-env:${@'do_create_bootstrap' if ${PACKAGE_NEEDS_BOOTSTRAP} else 'do_create' }"

addtask do_fetch_upstream_builddeps after do_collect_managed_builddeps

# SSTATETASKS += "do_fetch_upstream_builddeps"
# do_package[sstate-plaindirs] = "${WORKDIR}/SRPMS ${WORKDIR}/RPMS"
