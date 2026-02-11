
PN = "libXt"
PE = "0"
PV = "1.3.0"
PR = "5.el10"
PACKAGES = "libXt libXt-devel"


URI_libXt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXt-1.3.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXt = "
 glibc
 libICE
 libX11
 libSM
"

URI_libXt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXt-devel-1.3.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXt-devel = "
 pkgconf-pkg-config
 libICE-devel
 libSM-devel
 libX11-devel
 libXt
 xorg-x11-proto-devel
"
