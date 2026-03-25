inherit xcp-ng-rpm

SRCREV = "7eb9c8dbfcae5b18f63dac38876ce8043df15a0e"

DEPENDS += "xen"

RDEPENDS = " \
  xen \
  xcp-clipboardd \
"

EXTRA_UPSTREAM_DEPENDS = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/jemalloc-devel-5.3.0-10.el10_1.alma_altarch.x86_64_v2.rpm \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/jemalloc-5.3.0-10.el10_1.alma_altarch.x86_64_v2.rpm \
"
