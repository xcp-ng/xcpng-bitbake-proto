
inherit dnf-bridge

PN = "biosdevname"
PE = "0"
PV = "0.7.3"
PR = "19.el10"
PACKAGES = "biosdevname"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/biosdevname-0.7.3-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_biosdevname = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/biosdevname-0.7.3-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_biosdevname}"
RDEPENDS:biosdevname = " \
 glibc \
 pciutils-libs \
"
