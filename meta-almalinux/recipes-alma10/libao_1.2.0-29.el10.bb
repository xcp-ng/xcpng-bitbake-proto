
inherit dnf-bridge

PN = "libao"
PE = "0"
PV = "1.2.0"
PR = "29.el10"
PACKAGES = "libao libao-devel"


URI_libao = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libao-1.2.0-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libao = " \
 glibc \
 pulseaudio-libs \
 alsa-lib \
"

URI_libao-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libao-devel-1.2.0-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libao-devel = " \
 pkgconf-pkg-config \
 libao \
"
