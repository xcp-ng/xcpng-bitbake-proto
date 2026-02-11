
inherit dnf-bridge

PN = "iotop-c"
PE = "0"
PV = "1.26"
PR = "3.el10"
PACKAGES = "iotop-c"


URI_iotop-c = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iotop-c-1.26-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iotop-c = " \
 glibc \
 ncurses-libs \
"
