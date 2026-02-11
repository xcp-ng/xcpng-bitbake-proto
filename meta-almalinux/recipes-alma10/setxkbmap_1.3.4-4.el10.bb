
inherit dnf-bridge

PN = "setxkbmap"
PE = "0"
PV = "1.3.4"
PR = "4.el10"
PACKAGES = "setxkbmap"


URI_setxkbmap = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/setxkbmap-1.3.4-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:setxkbmap = " \
 glibc \
 libxkbfile \
 libX11 \
 libXrandr \
"
