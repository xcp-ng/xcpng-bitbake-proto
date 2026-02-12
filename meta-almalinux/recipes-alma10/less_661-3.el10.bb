
inherit dnf-bridge

PN = "less"
PE = "0"
PV = "661"
PR = "3.el10"
PACKAGES = "less"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/less-661-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_less = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/less-661-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_less}"
RDEPENDS:less = " \
 glibc \
 bash \
 ncurses-libs \
"
