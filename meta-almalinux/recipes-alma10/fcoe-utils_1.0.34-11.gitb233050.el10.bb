
inherit dnf-bridge

PN = "fcoe-utils"
PE = "0"
PV = "1.0.34"
PR = "11.gitb233050.el10"
PACKAGES = "fcoe-utils"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/fcoe-utils-1.0.34-11.gitb233050.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fcoe-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fcoe-utils-1.0.34-11.gitb233050.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fcoe-utils}"
RDEPENDS:fcoe-utils = " \
 libpciaccess \
 systemd \
 device-mapper-multipath \
 iproute \
 bash \
 glibc \
 lldpad \
"
