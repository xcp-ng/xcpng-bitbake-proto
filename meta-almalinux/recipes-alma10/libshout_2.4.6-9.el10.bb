
inherit dnf-bridge

PN = "libshout"
PE = "0"
PV = "2.4.6"
PR = "9.el10"
PACKAGES = "libshout libshout-devel"


URI_libshout = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libshout-2.4.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshout = " \
 libvorbis \
 libogg \
 speex \
 openssl-libs \
 glibc \
 libtheora \
"

URI_libshout-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libshout-devel-2.4.6-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshout-devel = " \
 libogg-devel \
 pkgconf-pkg-config \
 openssl-devel \
 libvorbis-devel \
 speex-devel \
 libshout \
 libtheora-devel \
"
