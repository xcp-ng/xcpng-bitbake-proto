
PN = "libXcursor"
PE = "0"
PV = "1.2.1"
PR = "9.el10"
PACKAGES = "libXcursor libXcursor-devel"


URI_libXcursor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcursor-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXcursor = "
 glibc
 libXfixes
 libX11
 libXrender
"

URI_libXcursor-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcursor-devel-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXcursor-devel = "
 libXfixes-devel
 pkgconf-pkg-config
 libXrender-devel
 xorg-x11-proto-devel
 libX11-devel
 libXcursor
"
