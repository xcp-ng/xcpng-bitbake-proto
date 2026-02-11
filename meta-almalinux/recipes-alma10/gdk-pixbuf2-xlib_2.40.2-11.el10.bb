
PN = "gdk-pixbuf2-xlib"
PE = "0"
PV = "2.40.2"
PR = "11.el10"
PACKAGES = "gdk-pixbuf2-xlib gdk-pixbuf2-xlib-devel"


URI_gdk-pixbuf2-xlib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gdk-pixbuf2-xlib-2.40.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdk-pixbuf2-xlib = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( )"
RPROVIDES:gdk-pixbuf2-xlib = "libgdk_pixbuf_xlib-2.0.so.0()(64bit) ( ) gdk-pixbuf2-xlib(x86-64) ( =  2.40.2-11.el10) gdk-pixbuf2-xlib ( =  2.40.2-11.el10)"

URI_gdk-pixbuf2-xlib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gdk-pixbuf2-xlib-devel-2.40.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdk-pixbuf2-xlib-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libgdk_pixbuf_xlib-2.0.so.0()(64bit) ( ) gdk-pixbuf2-xlib(x86-64) ( =  2.40.2-11.el10) pkgconfig(gdk-pixbuf-2.0) ( >=  2.39.2)"
RPROVIDES:gdk-pixbuf2-xlib-devel = "gdk-pixbuf2-xlib-devel ( =  2.40.2-11.el10) gdk-pixbuf2-xlib-devel(x86-64) ( =  2.40.2-11.el10) pkgconfig(gdk-pixbuf-xlib-2.0) ( =  2.40.2)"
