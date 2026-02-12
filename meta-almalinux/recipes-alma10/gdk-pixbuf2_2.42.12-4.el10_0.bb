
inherit dnf-bridge

PN = "gdk-pixbuf2"
PE = "0"
PV = "2.42.12"
PR = "4.el10_0"
PACKAGES = "gdk-pixbuf2 gdk-pixbuf2-devel gdk-pixbuf2-modules gdk-pixbuf2-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gdk-pixbuf2-2.42.12-4.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gdk-pixbuf2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdk-pixbuf2-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdk-pixbuf2}"
RDEPENDS:gdk-pixbuf2 = " \
 libpng \
 shared-mime-info \
 bash \
 glib2 \
 glibc \
 libjpeg-turbo \
"

URI_gdk-pixbuf2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdk-pixbuf2-devel-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdk-pixbuf2-devel}"
RDEPENDS:gdk-pixbuf2-devel = " \
 libtiff-devel \
 glib2-devel \
 shared-mime-info \
 pkgconf-pkg-config \
 gdk-pixbuf2 \
 glib2 \
 libpng-devel \
 glibc \
 libjpeg-turbo-devel \
"

URI_gdk-pixbuf2-modules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdk-pixbuf2-modules-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdk-pixbuf2-modules}"
RDEPENDS:gdk-pixbuf2-modules = " \
 glibc \
 libtiff \
 glib2 \
 gdk-pixbuf2 \
"

URI_gdk-pixbuf2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gdk-pixbuf2-tests-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdk-pixbuf2-tests}"
RDEPENDS:gdk-pixbuf2-tests = " \
 glibc \
 glib2 \
 gdk-pixbuf2 \
"
