
PN = "libXi"
PE = "0"
PV = "1.8.1"
PR = "7.el10"
PACKAGES = "libXi libXi-devel"


URI_libXi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXi-1.8.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXi = "
 glibc
 libX11
 libXext
"

URI_libXi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXi-devel-1.8.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXi-devel = "
 libXext-devel
 libXfixes-devel
 libXi
 pkgconf-pkg-config
 libX11-devel
 xorg-x11-proto-devel
"
