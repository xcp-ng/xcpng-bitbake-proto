
inherit dnf-bridge

PN = "xcb-util-cursor"
PE = "0"
PV = "0.1.4"
PR = "6.el10"
PACKAGES = "xcb-util-cursor xcb-util-cursor-devel"


URI_xcb-util-cursor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-cursor-0.1.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-cursor = " \
 glibc \
 libxcb \
 xcb-util-image \
 xcb-util-renderutil \
"

URI_xcb-util-cursor-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-cursor-devel-0.1.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-cursor-devel = " \
 xcb-util-renderutil-devel \
 pkgconf-pkg-config \
 libxcb-devel \
 xcb-util-cursor \
 xcb-util-image-devel \
"
