
inherit dnf-bridge

PN = "xrestop"
PE = "0"
PV = "0.6"
PR = "5.el10"
PACKAGES = "xrestop"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xrestop-0.6-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xrestop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xrestop-0.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xrestop}"
RDEPENDS:xrestop = " \
 glibc \
 libXres \
 ncurses-libs \
 libX11 \
"
