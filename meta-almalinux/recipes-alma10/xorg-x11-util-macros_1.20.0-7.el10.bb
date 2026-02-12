
inherit dnf-bridge

PN = "xorg-x11-util-macros"
PE = "0"
PV = "1.20.0"
PR = "7.el10"
PACKAGES = "xorg-x11-util-macros"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/xorg-x11-util-macros-1.20.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xorg-x11-util-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xorg-x11-util-macros-1.20.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xorg-x11-util-macros}"
RDEPENDS:xorg-x11-util-macros = " \
 automake \
 pkgconf-pkg-config \
 autoconf \
"
