
inherit dnf-bridge

PN = "libconfig"
PE = "0"
PV = "1.7.3"
PR = "10.el10"
PACKAGES = "libconfig libconfig-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libconfig-1.7.3-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libconfig = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libconfig-1.7.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libconfig}"
RDEPENDS:libconfig = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libconfig-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libconfig-devel-1.7.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libconfig-devel}"
RDEPENDS:libconfig-devel = " \
 libconfig \
 pkgconf-pkg-config \
"
