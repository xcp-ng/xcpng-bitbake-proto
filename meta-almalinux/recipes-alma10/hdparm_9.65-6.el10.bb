
inherit dnf-bridge

PN = "hdparm"
PE = "0"
PV = "9.65"
PR = "6.el10"
PACKAGES = "hdparm"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/hdparm-9.65-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hdparm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/hdparm-9.65-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hdparm}"
RDEPENDS:hdparm = " \
 glibc \
"
