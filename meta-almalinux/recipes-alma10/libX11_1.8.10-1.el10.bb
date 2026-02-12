
inherit dnf-bridge

PN = "libX11"
PE = "0"
PV = "1.8.10"
PR = "1.el10"
PACKAGES = "libX11 libX11-common libX11-devel libX11-xcb"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libX11-1.8.10-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libX11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-1.8.10-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libX11}"
RDEPENDS:libX11 = " \
 glibc \
 libxcb \
 libX11-common \
"

URI_libX11-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-common-1.8.10-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libX11-common}"
RDEPENDS:libX11-common = ""

URI_libX11-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-devel-1.8.10-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libX11-devel}"
RDEPENDS:libX11-devel = " \
 pkgconf-pkg-config \
 libX11 \
 libX11-devel \
 libX11-xcb \
 xorg-x11-proto-devel \
 libxcb-devel \
"

URI_libX11-xcb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-xcb-1.8.10-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libX11-xcb}"
RDEPENDS:libX11-xcb = " \
 glibc \
"
