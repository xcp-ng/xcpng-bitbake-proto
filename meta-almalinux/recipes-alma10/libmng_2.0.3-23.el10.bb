
inherit dnf-bridge

PN = "libmng"
PE = "0"
PV = "2.0.3"
PR = "23.el10"
PACKAGES = "libmng libmng-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libmng-2.0.3-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libmng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmng-2.0.3-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmng}"
RDEPENDS:libmng = " \
 glibc \
 lcms2 \
 zlib-ng-compat \
 libjpeg-turbo \
"

URI_libmng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmng-devel-2.0.3-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmng-devel}"
RDEPENDS:libmng-devel = " \
 zlib-ng-compat-devel \
 libmng \
 pkgconf-pkg-config \
 libjpeg-turbo-devel \
"
