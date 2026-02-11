
PN = "libqrtr-glib"
PE = "0"
PV = "1.2.2"
PR = "7.el10"
PACKAGES = "libqrtr-glib libqrtr-glib-devel"


URI_libqrtr-glib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libqrtr-glib-1.2.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqrtr-glib = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgio-2.0.so.0()(64bit) ( )"
RPROVIDES:libqrtr-glib = "libqrtr-glib.so.0()(64bit) ( ) libqrtr-glib ( =  1.2.2-7.el10) libqrtr-glib(x86-64) ( =  1.2.2-7.el10)"

URI_libqrtr-glib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libqrtr-glib-devel-1.2.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqrtr-glib-devel = "/usr/bin/pkg-config ( ) glib2-devel ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gio-2.0) ( ) libqrtr-glib.so.0()(64bit) ( ) libqrtr-glib(x86-64) ( =  1.2.2-7.el10)"
RPROVIDES:libqrtr-glib-devel = "libqrtr-glib-devel ( =  1.2.2-7.el10) libqrtr-glib-devel(x86-64) ( =  1.2.2-7.el10) pkgconfig(qrtr-glib) ( =  1.2.2)"
