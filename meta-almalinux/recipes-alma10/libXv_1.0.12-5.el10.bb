
inherit dnf-bridge

PN = "libXv"
PE = "0"
PV = "1.0.12"
PR = "5.el10"
PACKAGES = "libXv libXv-devel"


URI_libXv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXv-1.0.12-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXv = " \
 glibc \
 libX11 \
 libXext \
"

URI_libXv-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXv-devel-1.0.12-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXv-devel = " \
 libXext-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 libXv \
"
