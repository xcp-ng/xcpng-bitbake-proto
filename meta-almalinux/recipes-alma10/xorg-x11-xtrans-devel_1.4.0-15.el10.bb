
inherit dnf-bridge

PN = "xorg-x11-xtrans-devel"
PE = "0"
PV = "1.4.0"
PR = "15.el10"
PACKAGES = "xorg-x11-xtrans-devel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/xorg-x11-xtrans-devel-1.4.0-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xorg-x11-xtrans-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xorg-x11-xtrans-devel-1.4.0-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xorg-x11-xtrans-devel}"
RDEPENDS:xorg-x11-xtrans-devel = " \
 pkgconf-pkg-config \
"
