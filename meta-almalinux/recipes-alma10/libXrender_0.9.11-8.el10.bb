
inherit dnf-bridge

PN = "libXrender"
PE = "0"
PV = "0.9.11"
PR = "8.el10"
PACKAGES = "libXrender libXrender-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXrender-0.9.11-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXrender = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrender-0.9.11-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXrender}"
RDEPENDS:libXrender = " \
 glibc \
 libX11 \
"

URI_libXrender-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrender-devel-0.9.11-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXrender-devel}"
RDEPENDS:libXrender-devel = " \
 libXrender \
 libX11-devel \
 xorg-x11-proto-devel \
 pkgconf-pkg-config \
"
