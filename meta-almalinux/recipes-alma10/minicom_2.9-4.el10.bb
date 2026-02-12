
inherit dnf-bridge

PN = "minicom"
PE = "0"
PV = "2.9"
PR = "4.el10"
PACKAGES = "minicom"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/minicom-2.9-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_minicom = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/minicom-2.9-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_minicom}"
RDEPENDS:minicom = " \
 lrzsz \
 bash \
 ncurses-libs \
 glibc \
 lockdev \
"
