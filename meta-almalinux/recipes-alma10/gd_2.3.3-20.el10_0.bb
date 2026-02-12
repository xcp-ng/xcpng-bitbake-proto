
inherit dnf-bridge

PN = "gd"
PE = "0"
PV = "2.3.3"
PR = "20.el10_0"
PACKAGES = "gd gd-devel gd-progs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gd-2.3.3-20.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gd-2.3.3-20.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gd}"
RDEPENDS:gd = " \
 zlib-ng-compat \
 freetype \
 libpng \
 libwebp \
 libXpm \
 fontconfig \
 libX11 \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_gd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gd-devel-2.3.3-20.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gd-devel}"
RDEPENDS:gd-devel = " \
 libtiff-devel \
 gd \
 zlib-ng-compat-devel \
 freetype-devel \
 libwebp-devel \
 pkgconf-pkg-config \
 libXpm-devel \
 fontconfig-devel \
 libX11-devel \
 libpng-devel \
 libjpeg-turbo-devel \
"

URI_gd-progs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gd-progs-2.3.3-20.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gd-progs}"
RDEPENDS:gd-progs = " \
 glibc \
 gd \
 perl-interpreter \
 perl-libs \
"
