
PN = "libgsf"
PE = "0"
PV = "1.14.53"
PR = "2.el10"
PACKAGES = "libgsf libgsf-devel"


URI_libgsf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgsf-1.14.53-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgsf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libbz2.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.14)(64bit) ( )"
RPROVIDES:libgsf = "libgsf-1.so.114()(64bit) ( ) libgsf ( =  1.14.53-2.el10) libgsf(x86-64) ( =  1.14.53-2.el10)"

URI_libgsf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgsf-devel-1.14.53-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgsf-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) pkgconfig ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) glib2-devel ( ) libgio-2.0.so.0()(64bit) ( ) pkgconfig(libxml-2.0) ( ) libxml2-devel ( ) libgsf-1.so.114()(64bit) ( ) libgsf ( =  1.14.53-2.el10)"
RPROVIDES:libgsf-devel = "libgsf-devel ( =  1.14.53-2.el10) libgsf-devel(x86-64) ( =  1.14.53-2.el10) pkgconfig(libgsf-1) ( =  1.14.53)"
