
inherit dnf-bridge

PN = "cpio"
PE = "0"
PV = "2.15"
PR = "3.el10"
PACKAGES = "cpio"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/cpio-2.15-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cpio = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cpio-2.15-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cpio}"
RDEPENDS:cpio = " \
 glibc \
"
