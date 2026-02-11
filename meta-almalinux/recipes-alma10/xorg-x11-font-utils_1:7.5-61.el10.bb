
inherit dnf-bridge

PN = "xorg-x11-font-utils"
PE = "1"
PV = "7.5"
PR = "61.el10"
PACKAGES = "xorg-x11-font-utils"


URI_xorg-x11-font-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xorg-x11-font-utils-7.5-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-font-utils = " \
 glibc \
 bash \
 pkgconf-pkg-config \
"
