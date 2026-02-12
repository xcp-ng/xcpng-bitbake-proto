
inherit dnf-bridge

PN = "libotf"
PE = "0"
PV = "0.9.16"
PR = "6.el10"
PACKAGES = "libotf libotf-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libotf-0.9.16-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libotf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libotf-0.9.16-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libotf}"
RDEPENDS:libotf = " \
 freetype \
 libX11 \
 libXt \
 libXaw \
 glibc \
"

URI_libotf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libotf-devel-0.9.16-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libotf-devel}"
RDEPENDS:libotf-devel = " \
 freetype-devel \
 libotf \
 pkgconf-pkg-config \
"
