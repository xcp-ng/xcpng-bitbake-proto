
inherit dnf-bridge

PN = "libXtst"
PE = "0"
PV = "1.2.4"
PR = "8.el10"
PACKAGES = "libXtst libXtst-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXtst-1.2.4-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXtst = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXtst-1.2.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXtst}"
RDEPENDS:libXtst = " \
 glibc \
 libX11 \
 libXi \
 libXext \
"

URI_libXtst-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXtst-devel-1.2.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXtst-devel}"
RDEPENDS:libXtst-devel = " \
 libXext-devel \
 libXi-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 libXtst \
"
