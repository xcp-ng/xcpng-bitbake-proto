
inherit dnf-bridge

PN = "bc"
PE = "0"
PV = "1.07.1"
PR = "23.el10"
PACKAGES = "bc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/bc-1.07.1-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bc-1.07.1-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bc}"
RDEPENDS:bc = " \
 glibc \
 readline \
"
