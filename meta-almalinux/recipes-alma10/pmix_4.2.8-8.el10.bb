
inherit dnf-bridge

PN = "pmix"
PE = "0"
PV = "4.2.8"
PR = "8.el10"
PACKAGES = "pmix pmix-devel pmix-tools"


URI_pmix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pmix-4.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pmix = " \
 zlib-ng-compat \
 libevent \
 munge-libs \
 hwloc-libs \
 glibc \
"

URI_pmix-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pmix-devel-4.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pmix-devel = " \
 pmix-tools \
 pkgconf-pkg-config \
 pmix \
"

URI_pmix-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pmix-tools-4.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pmix-tools = " \
 glibc \
 pmix \
"
