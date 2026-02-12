
inherit dnf-bridge

PN = "gdk-pixbuf2-xlib"
PE = "0"
PV = "2.40.2"
PR = "11.el10"
PACKAGES = "gdk-pixbuf2-xlib gdk-pixbuf2-xlib-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/gdk-pixbuf2-xlib-2.40.2-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gdk-pixbuf2-xlib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gdk-pixbuf2-xlib-2.40.2-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdk-pixbuf2-xlib}"
RDEPENDS:gdk-pixbuf2-xlib = " \
 glibc \
 glib2 \
 libX11 \
 gdk-pixbuf2 \
"

URI_gdk-pixbuf2-xlib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gdk-pixbuf2-xlib-devel-2.40.2-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gdk-pixbuf2-xlib-devel}"
RDEPENDS:gdk-pixbuf2-xlib-devel = " \
 gdk-pixbuf2-devel \
 libX11-devel \
 pkgconf-pkg-config \
 gdk-pixbuf2-xlib \
"
