
PN = "libXdamage"
PE = "0"
PV = "1.1.6"
PR = "5.el10"
PACKAGES = "libXdamage libXdamage-devel"


URI_libXdamage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXdamage-1.1.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdamage = " \
 glibc \
 libXfixes \
 libX11 \
"

URI_libXdamage-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXdamage-devel-1.1.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdamage-devel = " \
 libXfixes-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 libXdamage \
"
