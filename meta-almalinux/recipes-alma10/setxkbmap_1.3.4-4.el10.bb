
inherit dnf-bridge

PN = "setxkbmap"
PE = "0"
PV = "1.3.4"
PR = "4.el10"
PACKAGES = "setxkbmap"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/setxkbmap-1.3.4-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_setxkbmap = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/setxkbmap-1.3.4-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_setxkbmap}"
RDEPENDS:setxkbmap = " \
 glibc \
 libxkbfile \
 libX11 \
 libXrandr \
"
