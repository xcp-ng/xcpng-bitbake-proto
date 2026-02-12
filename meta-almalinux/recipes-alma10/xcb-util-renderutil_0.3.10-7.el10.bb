
inherit dnf-bridge

PN = "xcb-util-renderutil"
PE = "0"
PV = "0.3.10"
PR = "7.el10"
PACKAGES = "xcb-util-renderutil xcb-util-renderutil-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xcb-util-renderutil-0.3.10-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xcb-util-renderutil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-renderutil-0.3.10-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xcb-util-renderutil}"
RDEPENDS:xcb-util-renderutil = " \
 glibc \
 libxcb \
"

URI_xcb-util-renderutil-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-renderutil-devel-0.3.10-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xcb-util-renderutil-devel}"
RDEPENDS:xcb-util-renderutil-devel = " \
 libxcb-devel \
 pkgconf-pkg-config \
 xcb-util-renderutil \
"
