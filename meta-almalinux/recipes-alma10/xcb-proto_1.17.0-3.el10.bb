
inherit dnf-bridge

PN = "xcb-proto"
PE = "0"
PV = "1.17.0"
PR = "3.el10"
PACKAGES = "xcb-proto"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/xcb-proto-1.17.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xcb-proto = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xcb-proto-1.17.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xcb-proto}"
RDEPENDS:xcb-proto = " \
 python3 \
 pkgconf-pkg-config \
"
