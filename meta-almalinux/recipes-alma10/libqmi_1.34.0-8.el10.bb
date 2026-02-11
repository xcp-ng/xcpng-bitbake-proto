
PN = "libqmi"
PE = "0"
PV = "1.34.0"
PR = "8.el10"
PACKAGES = "libqmi libqmi-utils libqmi-devel"


URI_libqmi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libqmi-1.34.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqmi = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmbim-glib.so.4()(64bit) ( ) libqrtr-glib.so.0()(64bit) ( )"
RPROVIDES:libqmi = "libqmi-glib.so.5()(64bit) ( ) libqmi(x86-64) ( =  1.34.0-8.el10) libqmi ( =  1.34.0-8.el10)"

URI_libqmi-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libqmi-utils-1.34.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqmi-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libmbim-glib.so.4()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) libqrtr-glib.so.0()(64bit) ( ) libqmi-glib.so.5()(64bit) ( ) libqmi(x86-64) ( =  1.34.0-8.el10)"
RPROVIDES:libqmi-utils = "libqmi-utils ( =  1.34.0-8.el10) libqmi-utils(x86-64) ( =  1.34.0-8.el10)"

URI_libqmi-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libqmi-devel-1.34.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqmi-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gio-unix-2.0) ( ) glib2-devel(x86-64) ( ) libqmi-glib.so.5()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.56) libqmi(x86-64) ( =  1.34.0-8.el10) pkgconfig(mbim-glib) ( >=  1.18.0) pkgconfig(qrtr-glib) ( >=  1.0.0)"
RPROVIDES:libqmi-devel = "libqmi-devel ( =  1.34.0-8.el10) libqmi-devel(x86-64) ( =  1.34.0-8.el10) pkgconfig(qmi-glib) ( =  1.34.0)"
