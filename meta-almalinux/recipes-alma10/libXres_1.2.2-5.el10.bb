
PN = "libXres"
PE = "0"
PV = "1.2.2"
PR = "5.el10"
PACKAGES = "libXres libXres-devel"


URI_libXres = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXres-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXres = " \
 glibc \
 libX11 \
 libXext \
"

URI_libXres-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXres-devel-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXres-devel = " \
 libXext-devel \
 pkgconf-pkg-config \
 libX11-devel \
 libXres \
 xorg-x11-proto-devel \
"
