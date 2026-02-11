
inherit dnf-bridge

PN = "libxkbfile"
PE = "0"
PV = "1.1.3"
PR = "3.el10"
PACKAGES = "libxkbfile libxkbfile-devel"


URI_libxkbfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbfile-1.1.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbfile = " \
 glibc \
 libX11 \
"

URI_libxkbfile-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxkbfile-devel-1.1.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbfile-devel = " \
 libX11-devel \
 xorg-x11-proto-devel \
 libxkbfile \
 pkgconf-pkg-config \
"
