inherit xcp-ng-rpm

SRCREV = "474d45b097d0908a9879fc79a87ba2e9506a4d0b"

DEPENDS += "xen"

RDEPENDS = " \
  xen \
  xcp-clipboardd \
"

EXTRA_UPSTREAM_DEPENDS = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/jemalloc-devel-5.3.0-10.el10_1.alma_altarch.x86_64_v2.rpm \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/jemalloc-5.3.0-10.el10_1.alma_altarch.x86_64_v2.rpm \
"
