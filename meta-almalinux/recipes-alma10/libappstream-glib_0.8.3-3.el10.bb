
inherit dnf-bridge

PN = "libappstream-glib"
PE = "0"
PV = "0.8.3"
PR = "3.el10"
PACKAGES = "libappstream-glib libappstream-glib-devel libappstream-glib-builder"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libappstream-glib-0.8.3-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libappstream-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libappstream-glib-0.8.3-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libappstream-glib}"
RDEPENDS:libappstream-glib = " \
 libuuid \
 libarchive \
 libgcc \
 json-glib \
 gdk-pixbuf2 \
 glib2 \
 libcurl \
 glibc \
 rpm-libs \
"

URI_libappstream-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libappstream-glib-devel-0.8.3-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libappstream-glib-devel}"
RDEPENDS:libappstream-glib-devel = " \
 libarchive-devel \
 glib2-devel \
 pkgconf-pkg-config \
 gdk-pixbuf2-devel \
 libuuid-devel \
 libappstream-glib \
"

URI_libappstream-glib-builder = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libappstream-glib-builder-0.8.3-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libappstream-glib-builder}"
RDEPENDS:libappstream-glib-builder = " \
 freetype \
 libarchive \
 libgcc \
 json-glib \
 pango \
 gdk-pixbuf2 \
 fontconfig \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 rpm-libs \
 libappstream-glib \
"
