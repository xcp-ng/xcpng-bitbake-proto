
PN = "libXfixes"
PE = "0"
PV = "6.0.1"
PR = "5.el10"
PACKAGES = "libXfixes libXfixes-devel"


URI_libXfixes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXfixes-6.0.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXfixes = "
 glibc
 libX11
"

URI_libXfixes-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXfixes-devel-6.0.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXfixes-devel = "
 libXfixes
 libX11-devel
 xorg-x11-proto-devel
 pkgconf-pkg-config
"
