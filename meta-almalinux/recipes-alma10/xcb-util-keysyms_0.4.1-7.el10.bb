
PN = "xcb-util-keysyms"
PE = "0"
PV = "0.4.1"
PR = "7.el10"
PACKAGES = "xcb-util-keysyms xcb-util-keysyms-devel"


URI_xcb-util-keysyms = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-keysyms-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-keysyms = "
 glibc
 libxcb
"

URI_xcb-util-keysyms-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xcb-util-keysyms-devel-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-keysyms-devel = "
 libxcb-devel
 pkgconf-pkg-config
 xcb-util-keysyms
"
