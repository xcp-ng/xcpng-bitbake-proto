
PN = "libXext"
PE = "0"
PV = "1.3.6"
PR = "3.el10"
PACKAGES = "libXext libXext-devel"


URI_libXext = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXext-1.3.6-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXext = "
 glibc
 libX11
"

URI_libXext-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXext-devel-1.3.6-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXext-devel = "
 libX11-devel
 xorg-x11-proto-devel
 pkgconf-pkg-config
 libXext
"
