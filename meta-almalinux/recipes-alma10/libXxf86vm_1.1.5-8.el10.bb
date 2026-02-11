
PN = "libXxf86vm"
PE = "0"
PV = "1.1.5"
PR = "8.el10"
PACKAGES = "libXxf86vm libXxf86vm-devel"


URI_libXxf86vm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXxf86vm-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXxf86vm = " \
 glibc \
 libX11 \
 libXext \
"

URI_libXxf86vm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXxf86vm-devel-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXxf86vm-devel = " \
 libXext-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 libXxf86vm \
"
