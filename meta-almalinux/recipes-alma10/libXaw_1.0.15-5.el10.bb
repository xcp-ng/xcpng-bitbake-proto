
inherit dnf-bridge

PN = "libXaw"
PE = "0"
PV = "1.0.15"
PR = "5.el10"
PACKAGES = "libXaw libXaw-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXaw-1.0.15-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXaw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXaw-1.0.15-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXaw}"
RDEPENDS:libXaw = " \
 libXmu \
 libXpm \
 libX11 \
 libXt \
 glibc \
 libXext \
"

URI_libXaw-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXaw-devel-1.0.15-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXaw-devel}"
RDEPENDS:libXaw-devel = " \
 libXext-devel \
 libXmu-devel \
 pkgconf-pkg-config \
 libXpm-devel \
 libX11-devel \
 xorg-x11-proto-devel \
 libXt-devel \
 libXaw \
"
