
inherit dnf-bridge

PN = "chrpath"
PE = "0"
PV = "0.16"
PR = "25.el10"
PACKAGES = "chrpath"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/chrpath-0.16-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_chrpath = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/chrpath-0.16-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_chrpath}"
RDEPENDS:chrpath = " \
 glibc \
"
