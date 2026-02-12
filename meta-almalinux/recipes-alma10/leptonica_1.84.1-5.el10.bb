
inherit dnf-bridge

PN = "leptonica"
PE = "0"
PV = "1.84.1"
PR = "5.el10"
PACKAGES = "leptonica leptonica-devel leptonica-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/leptonica-1.84.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_leptonica = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/leptonica-1.84.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_leptonica}"
RDEPENDS:leptonica = " \
 giflib \
 zlib-ng-compat \
 libpng \
 libwebp \
 glibc \
 libjpeg-turbo \
 libtiff \
"

URI_leptonica-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/leptonica-devel-1.84.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_leptonica-devel}"
RDEPENDS:leptonica-devel = " \
 libtiff-devel \
 cmake-filesystem \
 zlib-ng-compat-devel \
 leptonica \
 libwebp-devel \
 pkgconf-pkg-config \
 libpng-devel \
 libjpeg-turbo-devel \
"

URI_leptonica-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/leptonica-tools-1.84.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_leptonica-tools}"
RDEPENDS:leptonica-tools = " \
 glibc \
 leptonica \
"
