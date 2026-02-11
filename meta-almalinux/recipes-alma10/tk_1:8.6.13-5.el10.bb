
PN = "tk"
PE = "1"
PV = "8.6.13"
PR = "5.el10"
PACKAGES = "tk tk-devel"


URI_tk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tk-8.6.13-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tk = " \
 libXft \
 tcl \
 fontconfig \
 libX11 \
 bash \
 glibc \
"

URI_tk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tk-devel-8.6.13-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tk-devel = " \
 tcl-devel \
 libXft-devel \
 tk \
 pkgconf-pkg-config \
 libX11-devel \
"
