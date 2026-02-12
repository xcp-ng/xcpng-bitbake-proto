
inherit dnf-bridge

PN = "libXfont2"
PE = "0"
PV = "2.0.6"
PR = "5.el10"
PACKAGES = "libXfont2 libXfont2-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXfont2-2.0.6-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXfont2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXfont2-2.0.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXfont2}"
RDEPENDS:libXfont2 = " \
 glibc \
 zlib-ng-compat \
 libfontenc \
 freetype \
"

URI_libXfont2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXfont2-devel-2.0.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXfont2-devel}"
RDEPENDS:libXfont2-devel = " \
 libXfont2 \
 libfontenc-devel \
 zlib-ng-compat-devel \
 freetype-devel \
 pkgconf-pkg-config \
 xorg-x11-proto-devel \
"
