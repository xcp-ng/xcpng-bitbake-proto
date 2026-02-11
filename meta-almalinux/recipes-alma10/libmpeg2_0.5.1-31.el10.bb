
inherit dnf-bridge

PN = "libmpeg2"
PE = "0"
PV = "0.5.1"
PR = "31.el10"
PACKAGES = "libmpeg2 libmpeg2-devel mpeg2dec"


URI_libmpeg2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmpeg2-0.5.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmpeg2 = " \
 glibc \
"

URI_libmpeg2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmpeg2-devel-0.5.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmpeg2-devel = " \
 libmpeg2 \
 pkgconf-pkg-config \
"

URI_mpeg2dec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mpeg2dec-0.5.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpeg2dec = " \
 libX11 \
 libmpeg2 \
 libXv \
 glibc \
 sdl12-compat \
 libXext \
"
