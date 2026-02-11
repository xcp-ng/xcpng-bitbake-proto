
inherit dnf-bridge

PN = "libpciaccess"
PE = "0"
PV = "0.16"
PR = "16.el10"
PACKAGES = "libpciaccess libpciaccess-devel"


URI_libpciaccess = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpciaccess-0.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpciaccess = " \
 glibc \
 hwdata \
"

URI_libpciaccess-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpciaccess-devel-0.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpciaccess-devel = " \
 libpciaccess \
 pkgconf-pkg-config \
"
