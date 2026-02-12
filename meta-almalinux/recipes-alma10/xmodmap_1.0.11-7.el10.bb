
inherit dnf-bridge

PN = "xmodmap"
PE = "0"
PV = "1.0.11"
PR = "7.el10"
PACKAGES = "xmodmap"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/xmodmap-1.0.11-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xmodmap = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmodmap-1.0.11-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xmodmap}"
RDEPENDS:xmodmap = " \
 glibc \
 libX11 \
"
