
inherit dnf-bridge

PN = "xcb-util"
PE = "0"
PV = "0.4.1"
PR = "7.el10"
PACKAGES = "xcb-util xcb-util-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xcb-util-0.4.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xcb-util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xcb-util}"
RDEPENDS:xcb-util = " \
 glibc \
 libxcb \
"

URI_xcb-util-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xcb-util-devel-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xcb-util-devel}"
RDEPENDS:xcb-util-devel = " \
 xcb-util \
 libxcb-devel \
 pkgconf-pkg-config \
"
