
inherit dnf-bridge

PN = "libXres"
PE = "0"
PV = "1.2.2"
PR = "5.el10"
PACKAGES = "libXres libXres-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXres-1.2.2-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXres = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXres-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXres}"
RDEPENDS:libXres = " \
 glibc \
 libX11 \
 libXext \
"

URI_libXres-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXres-devel-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXres-devel}"
RDEPENDS:libXres-devel = " \
 libXext-devel \
 pkgconf-pkg-config \
 libX11-devel \
 libXres \
 xorg-x11-proto-devel \
"
