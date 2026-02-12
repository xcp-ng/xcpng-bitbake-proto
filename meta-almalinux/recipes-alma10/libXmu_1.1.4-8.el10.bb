
inherit dnf-bridge

PN = "libXmu"
PE = "0"
PV = "1.1.4"
PR = "8.el10"
PACKAGES = "libXmu libXmu-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXmu-1.1.4-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXmu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXmu-1.1.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXmu}"
RDEPENDS:libXmu = " \
 glibc \
 libXt \
 libX11 \
 libXext \
"

URI_libXmu-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXmu-devel-1.1.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXmu-devel}"
RDEPENDS:libXmu-devel = " \
 libXext-devel \
 libXmu \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 libXt-devel \
"
