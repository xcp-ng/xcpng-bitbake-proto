
inherit dnf-bridge

PN = "ttembed"
PE = "0"
PV = "1.1"
PR = "22.el10"
PACKAGES = "ttembed"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/ttembed-1.1-22.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ttembed = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ttembed-1.1-22.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ttembed}"
RDEPENDS:ttembed = " \
 glibc \
"
