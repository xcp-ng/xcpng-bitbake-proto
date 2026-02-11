
PN = "xcb-util-wm"
PE = "0"
PV = "0.4.2"
PR = "7.el10"
PACKAGES = "xcb-util-wm xcb-util-wm-devel"


URI_xcb-util-wm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-wm-0.4.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-wm = "
 glibc
 libxcb
"

URI_xcb-util-wm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xcb-util-wm-devel-0.4.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-wm-devel = "
 xcb-util-wm
 libxcb-devel
 pkgconf-pkg-config
"
