
PN = "xkbcomp"
PE = "0"
PV = "1.4.7"
PR = "3.el10"
PACKAGES = "xkbcomp xkbcomp-devel"


URI_xkbcomp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xkbcomp-1.4.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xkbcomp = " \
 glibc \
 libxkbfile \
 libX11 \
"

URI_xkbcomp-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xkbcomp-devel-1.4.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xkbcomp-devel = " \
 xkbcomp \
 pkgconf-pkg-config \
"
