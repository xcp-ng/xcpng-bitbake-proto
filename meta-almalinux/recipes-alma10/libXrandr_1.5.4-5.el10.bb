
inherit dnf-bridge

PN = "libXrandr"
PE = "0"
PV = "1.5.4"
PR = "5.el10"
PACKAGES = "libXrandr libXrandr-devel"


URI_libXrandr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrandr-1.5.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXrandr = " \
 glibc \
 libX11 \
 libXrender \
 libXext \
"

URI_libXrandr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrandr-devel-1.5.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXrandr-devel = " \
 libXext-devel \
 pkgconf-pkg-config \
 libXrandr \
 libXrender-devel \
 libX11-devel \
 xorg-x11-proto-devel \
"
