
PN = "pyproject-rpm-macros"
PE = "0"
PV = "1.16.2"
PR = "1.el10"
PACKAGES = "pyproject-srpm-macros pyproject-rpm-macros"


URI_pyproject-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pyproject-srpm-macros-1.16.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:pyproject-srpm-macros = "pyproject-rpm-macros ( if  pyproject-rpm-macros) rpm-build ( if  rpm-build)"
RPROVIDES:pyproject-srpm-macros = "rpm_macro(buildsystem_pyproject_build) ( ) rpm_macro(buildsystem_pyproject_conf) ( ) rpm_macro(buildsystem_pyproject_generate_buildrequires) ( ) rpm_macro(buildsystem_pyproject_install) ( ) rpm_macro(pyproject_buildrequires) ( ) pyproject-srpm-macros ( =  1.16.2-1.el10)"

URI_pyproject-rpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pyproject-rpm-macros-1.16.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:pyproject-rpm-macros = "/usr/bin/find ( ) /usr/bin/sed ( ) python-rpm-macros ( ) python-srpm-macros ( ) python3-rpm-macros ( ) rpm-build ( if  rpm-build) pyproject-srpm-macros ( if  pyproject-srpm-macros)"
RPROVIDES:pyproject-rpm-macros = "rpm_macro(_pyproject_build_flags) ( ) rpm_macro(_pyproject_builddir) ( ) rpm_macro(_pyproject_buildrequires) ( ) rpm_macro(_pyproject_check_import_allow_no_modules) ( ) rpm_macro(_pyproject_files_pkgversion) ( ) rpm_macro(_pyproject_files_prefix) ( ) rpm_macro(_pyproject_ghost_distinfo) ( ) rpm_macro(_pyproject_modules) ( ) rpm_macro(_pyproject_record) ( ) rpm_macro(_pyproject_tomlidep) ( ) rpm_macro(_pyproject_wheeldir) ( ) rpm_macro(_set_pytest_addopts) ( ) rpm_macro(buildsystem_pyproject_build) ( ) rpm_macro(buildsystem_pyproject_check) ( ) rpm_macro(buildsystem_pyproject_conf) ( ) rpm_macro(buildsystem_pyproject_generate_buildrequires) ( ) rpm_macro(buildsystem_pyproject_install) ( ) rpm_macro(default_toxenv) ( ) rpm_macro(pyproject_build_lib) ( ) rpm_macro(pyproject_buildrequires) ( ) rpm_macro(pyproject_check_import) ( ) rpm_macro(pyproject_extras_subpkg) ( ) rpm_macro(pyproject_files) ( ) rpm_macro(pyproject_install) ( ) rpm_macro(pyproject_save_files) ( ) rpm_macro(pyproject_wheel) ( ) rpm_macro(tox) ( ) rpm_macro(toxenv) ( ) pyproject-rpm-macros ( =  1.16.2-1.el10)"
