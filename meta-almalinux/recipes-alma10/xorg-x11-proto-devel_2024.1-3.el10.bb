
inherit dnf-bridge

PN = "xorg-x11-proto-devel"
PE = "0"
PV = "2024.1"
PR = "3.el10"
PACKAGES = "xorg-x11-proto-devel"


URI_xorg-x11-proto-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xorg-x11-proto-devel-2024.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xorg-x11-proto-devel = " \
 xorg-x11-proto-devel \
 pkgconf-pkg-config \
"
