
inherit dnf-bridge

PN = "lsscsi"
PE = "0"
PV = "0.32"
PR = "15.el10"
PACKAGES = "lsscsi"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/lsscsi-0.32-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lsscsi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lsscsi-0.32-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lsscsi}"
RDEPENDS:lsscsi = " \
 glibc \
"
