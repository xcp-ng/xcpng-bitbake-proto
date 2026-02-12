
inherit dnf-bridge

PN = "setserial"
PE = "0"
PV = "2.17"
PR = "63.el10"
PACKAGES = "setserial"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/setserial-2.17-63.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_setserial = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/setserial-2.17-63.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_setserial}"
RDEPENDS:setserial = " \
 glibc \
"
