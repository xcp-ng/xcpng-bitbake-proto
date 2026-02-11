
inherit dnf-bridge

PN = "libXinerama"
PE = "0"
PV = "1.1.5"
PR = "8.el10"
PACKAGES = "libXinerama libXinerama-devel"


URI_libXinerama = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXinerama-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXinerama = " \
 glibc \
 libX11 \
 libXext \
"

URI_libXinerama-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXinerama-devel-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXinerama-devel = " \
 libXext-devel \
 libXinerama \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
"
