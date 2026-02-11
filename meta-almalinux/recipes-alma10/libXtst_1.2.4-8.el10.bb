
PN = "libXtst"
PE = "0"
PV = "1.2.4"
PR = "8.el10"
PACKAGES = "libXtst libXtst-devel"


URI_libXtst = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXtst-1.2.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXtst = "
 glibc
 libX11
 libXi
 libXext
"

URI_libXtst-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXtst-devel-1.2.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXtst-devel = "
 libXext-devel
 libXi-devel
 pkgconf-pkg-config
 libX11-devel
 xorg-x11-proto-devel
 libXtst
"
