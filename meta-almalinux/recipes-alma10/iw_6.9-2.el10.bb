
inherit dnf-bridge

PN = "iw"
PE = "0"
PV = "6.9"
PR = "2.el10"
PACKAGES = "iw"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/iw-6.9-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_iw = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iw-6.9-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iw}"
RDEPENDS:iw = " \
 glibc \
 libnl3 \
"
