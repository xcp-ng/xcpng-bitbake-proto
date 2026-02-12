
inherit dnf-bridge

PN = "libgsf"
PE = "0"
PV = "1.14.53"
PR = "2.el10"
PACKAGES = "libgsf libgsf-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libgsf-1.14.53-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libgsf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgsf-1.14.53-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgsf}"
RDEPENDS:libgsf = " \
 zlib-ng-compat \
 bzip2-libs \
 libxml2 \
 gdk-pixbuf2 \
 glib2 \
 glibc \
"

URI_libgsf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgsf-devel-1.14.53-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgsf-devel}"
RDEPENDS:libgsf-devel = " \
 libxml2-devel \
 glib2-devel \
 pkgconf-pkg-config \
 libgsf \
 glib2 \
 glibc \
"
