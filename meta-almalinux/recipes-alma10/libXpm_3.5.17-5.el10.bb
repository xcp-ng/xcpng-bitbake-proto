
PN = "libXpm"
PE = "0"
PV = "3.5.17"
PR = "5.el10"
PACKAGES = "libXpm libXpm-devel"


URI_libXpm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXpm-3.5.17-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXpm = " \
 glibc \
 libX11 \
"

URI_libXpm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXpm-devel-3.5.17-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXpm-devel = " \
 libXpm \
 pkgconf-pkg-config \
 libX11 \
 libX11-devel \
 libXt \
 glibc \
 libXext \
"
