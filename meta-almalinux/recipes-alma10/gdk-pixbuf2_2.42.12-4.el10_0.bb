
PN = "gdk-pixbuf2"
PE = "0"
PV = "2.42.12"
PR = "4.el10_0"
PACKAGES = "gdk-pixbuf2 gdk-pixbuf2-devel gdk-pixbuf2-modules gdk-pixbuf2-tests"


URI_gdk-pixbuf2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdk-pixbuf2-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdk-pixbuf2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) shared-mime-info ( ) glib2(x86-64) ( >=  2.56.0)"
RPROVIDES:gdk-pixbuf2 = "libgdk_pixbuf-2.0.so.0()(64bit) ( ) gdk-pixbuf2(x86-64) ( =  2.42.12-4.el10_0) gdk-pixbuf2 ( =  2.42.12-4.el10_0)"

URI_gdk-pixbuf2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdk-pixbuf2-devel-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdk-pixbuf2-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) pkgconfig(libjpeg) ( ) pkgconfig(libpng) ( ) pkgconfig(libtiff-4) ( ) pkgconfig(shared-mime-info) ( ) gdk-pixbuf2(x86-64) ( =  2.42.12-4.el10_0) glib2-devel(x86-64) ( >=  2.56.0) pkgconfig(gio-2.0) ( >=  2.56.0) pkgconfig(glib-2.0) ( >=  2.56.0) pkgconfig(gmodule-no-export-2.0) ( >=  2.56.0) pkgconfig(gobject-2.0) ( >=  2.56.0)"
RPROVIDES:gdk-pixbuf2-devel = "pkgconfig(gdk-pixbuf-2.0) ( =  2.42.12) gdk-pixbuf2-devel ( =  2.42.12-4.el10_0) gdk-pixbuf2-devel(x86-64) ( =  2.42.12-4.el10_0)"

URI_gdk-pixbuf2-modules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gdk-pixbuf2-modules-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdk-pixbuf2-modules = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) gdk-pixbuf2(x86-64) ( =  2.42.12-4.el10_0)"
RPROVIDES:gdk-pixbuf2-modules = "libpixbufloader-gif.so()(64bit) ( ) libpixbufloader-tiff.so()(64bit) ( ) gdk-pixbuf2-modules ( =  2.42.12-4.el10_0) gdk-pixbuf2-modules(x86-64) ( =  2.42.12-4.el10_0)"

URI_gdk-pixbuf2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gdk-pixbuf2-tests-2.42.12-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdk-pixbuf2-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) gdk-pixbuf2(x86-64) ( =  2.42.12-4.el10_0)"
RPROVIDES:gdk-pixbuf2-tests = "gdk-pixbuf2-tests ( =  2.42.12-4.el10_0) gdk-pixbuf2-tests(x86-64) ( =  2.42.12-4.el10_0)"
