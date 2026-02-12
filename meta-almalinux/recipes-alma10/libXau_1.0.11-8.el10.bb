
inherit dnf-bridge

PN = "libXau"
PE = "0"
PV = "1.0.11"
PR = "8.el10"
PACKAGES = "libXau libXau-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXau-1.0.11-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXau = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXau-1.0.11-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXau}"
RDEPENDS:libXau = " \
 glibc \
"

URI_libXau-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXau-devel-1.0.11-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXau-devel}"
RDEPENDS:libXau-devel = " \
 xorg-x11-proto-devel \
 libXau \
 pkgconf-pkg-config \
"
