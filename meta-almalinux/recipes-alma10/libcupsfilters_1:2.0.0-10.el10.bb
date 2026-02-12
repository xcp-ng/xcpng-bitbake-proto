
inherit dnf-bridge

PN = "libcupsfilters"
PE = "1"
PV = "2.0.0"
PR = "10.el10"
PACKAGES = "libcupsfilters libcupsfilters-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libcupsfilters-2.0.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libcupsfilters = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcupsfilters-2.0.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcupsfilters}"
RDEPENDS:libcupsfilters = " \
 qpdf-libs \
 lcms2 \
 libpng \
 cups-filesystem \
 libgcc \
 cups-libs \
 ghostscript \
 fontconfig \
 poppler-cpp \
 libstdc++ \
 colord \
 libexif \
 glibc \
 libjpeg-turbo \
 dbus-libs \
 libtiff \
"

URI_libcupsfilters-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcupsfilters-devel-2.0.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcupsfilters-devel}"
RDEPENDS:libcupsfilters-devel = " \
 pkgconf-pkg-config \
 libcupsfilters \
"
