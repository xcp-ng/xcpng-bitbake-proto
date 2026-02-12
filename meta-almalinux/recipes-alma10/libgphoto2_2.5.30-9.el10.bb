
inherit dnf-bridge

PN = "libgphoto2"
PE = "0"
PV = "2.5.30"
PR = "9.el10"
PACKAGES = "libgphoto2 libgphoto2-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libgphoto2-2.5.30-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libgphoto2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgphoto2-2.5.30-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgphoto2}"
RDEPENDS:libgphoto2 = " \
 gd \
 libtool-ltdl \
 libxml2 \
 libexif \
 bash \
 libcurl \
 glibc \
 libjpeg-turbo \
 lockdev \
 libusb1 \
"

URI_libgphoto2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgphoto2-devel-2.5.30-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgphoto2-devel}"
RDEPENDS:libgphoto2-devel = " \
 libgphoto2-devel \
 pkgconf-pkg-config \
 libgphoto2 \
 bash \
 libexif-devel \
"
