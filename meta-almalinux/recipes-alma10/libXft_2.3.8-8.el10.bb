
inherit dnf-bridge

PN = "libXft"
PE = "0"
PV = "2.3.8"
PR = "8.el10"
PACKAGES = "libXft libXft-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXft-2.3.8-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXft = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXft-2.3.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXft}"
RDEPENDS:libXft = " \
 freetype \
 fontconfig \
 libXrender \
 libX11 \
 glibc \
"

URI_libXft-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXft-devel-2.3.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXft-devel}"
RDEPENDS:libXft-devel = " \
 libXft \
 freetype-devel \
 pkgconf-pkg-config \
 fontconfig-devel \
 libXrender-devel \
 xorg-x11-proto-devel \
"
