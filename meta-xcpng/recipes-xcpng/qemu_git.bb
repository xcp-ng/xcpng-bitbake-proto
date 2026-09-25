inherit xcp-ng-rpm

SRCREV = "3c714ba0a25b43ef1371bf3047bbf6d4a0cbc73f"

DEPENDS += "xen"

RDEPENDS = " \
  xen \
  xcp-clipboardd \
"

EXTRA_UPSTREAM_DEPENDS = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/jemalloc-devel-5.3.0-10.el10_1.alma_altarch.x86_64_v2.rpm \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/jemalloc-5.3.0-10.el10_1.alma_altarch.x86_64_v2.rpm \
"
