inherit xcp-ng-rpm

SRCREV = "8c93ac1b6f6d75ef9c12d554130dbe4abd51ea4d"

DEPENDS += "xen kernel"

RDEPENDS = "xen"

EXTRA_UPSTREAM_DEPENDS = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/lcov-2.0-5.el10_1.alma_altarch.noarch.rpm \
"
