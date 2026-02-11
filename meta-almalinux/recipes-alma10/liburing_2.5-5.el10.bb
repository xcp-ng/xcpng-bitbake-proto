
inherit dnf-bridge

PN = "liburing"
PE = "0"
PV = "2.5"
PR = "5.el10"
PACKAGES = "liburing liburing-devel"


URI_liburing = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/liburing-2.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liburing = " \
 glibc \
"

URI_liburing-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liburing-devel-2.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liburing-devel = " \
 pkgconf-pkg-config \
 liburing \
"
