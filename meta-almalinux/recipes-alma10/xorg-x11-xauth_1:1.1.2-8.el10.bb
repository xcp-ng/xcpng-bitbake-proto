
inherit dnf-bridge

PN = "xorg-x11-xauth"
PE = "1"
PV = "1.1.2"
PR = "8.el10"
PACKAGES = "xorg-x11-xauth"


URI_xorg-x11-xauth = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xorg-x11-xauth-1.1.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-xauth = " \
 libXmu \
 libX11 \
 libXau \
 glibc \
 libXext \
"
