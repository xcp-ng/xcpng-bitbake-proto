
inherit dnf-bridge

PN = "resolv_wrapper"
PE = "0"
PV = "1.1.8"
PR = "9.el10"
PACKAGES = "resolv_wrapper"


URI_resolv_wrapper = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/resolv_wrapper-1.1.8-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:resolv_wrapper = " \
 glibc \
 cmake-filesystem \
 pkgconf-pkg-config \
"
