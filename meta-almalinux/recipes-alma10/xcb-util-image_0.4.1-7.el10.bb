
inherit dnf-bridge

PN = "xcb-util-image"
PE = "0"
PV = "0.4.1"
PR = "7.el10"
PACKAGES = "xcb-util-image xcb-util-image-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xcb-util-image-0.4.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xcb-util-image = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-image-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xcb-util-image}"
RDEPENDS:xcb-util-image = " \
 glibc \
 libxcb \
 xcb-util \
"

URI_xcb-util-image-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-image-devel-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xcb-util-image-devel}"
RDEPENDS:xcb-util-image-devel = " \
 libxcb-devel \
 xcb-util-image \
 pkgconf-pkg-config \
"
