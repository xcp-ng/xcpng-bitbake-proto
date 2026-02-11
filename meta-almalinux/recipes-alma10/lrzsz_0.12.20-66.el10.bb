
inherit dnf-bridge

PN = "lrzsz"
PE = "0"
PV = "0.12.20"
PR = "66.el10"
PACKAGES = "lrzsz"


URI_lrzsz = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lrzsz-0.12.20-66.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lrzsz = " \
 glibc \
"
