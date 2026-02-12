
inherit dnf-bridge

PN = "numatop"
PE = "0"
PV = "2.4"
PR = "3.el10"
PACKAGES = "numatop"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/numatop-2.4-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_numatop = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/numatop-2.4-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_numatop}"
RDEPENDS:numatop = " \
 glibc \
 ncurses-libs \
 numactl-libs \
"
