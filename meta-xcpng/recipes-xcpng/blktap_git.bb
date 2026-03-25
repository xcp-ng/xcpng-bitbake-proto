inherit xcp-ng-rpm

SRCREV = "26c9c7f9fc326fd24a18b94fd921af0c247e44eb"

DEPENDS += "xen kernel"

RDEPENDS = "xen"

EXTRA_UPSTREAM_DEPENDS = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/lcov-2.0-5.el10_1.alma_altarch.noarch.rpm \
"
