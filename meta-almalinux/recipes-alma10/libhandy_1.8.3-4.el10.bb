
PN = "libhandy"
PE = "0"
PV = "1.8.3"
PR = "4.el10"
PACKAGES = "libhandy libhandy-devel"


URI_libhandy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libhandy-1.8.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhandy = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libfribidi.so.0()(64bit) ( )"
RPROVIDES:libhandy = "libhandy-1.so.0()(64bit) ( ) libhandy-1.so.0(LIBHANDY_1_0)(64bit) ( ) libhandy ( =  1.8.3-4.el10) libhandy(x86-64) ( =  1.8.3-4.el10) libhandy1 ( =  1.8.3-4.el10) libhandy1(x86-64) ( =  1.8.3-4.el10)"

URI_libhandy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libhandy-devel-1.8.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhandy-devel = "/usr/bin/pkg-config ( ) pkgconfig(gtk+-3.0) ( ) libhandy-1.so.0()(64bit) ( ) libhandy(x86-64) ( =  1.8.3-4.el10)"
RPROVIDES:libhandy-devel = "libhandy-devel ( =  1.8.3-4.el10) libhandy-devel(x86-64) ( =  1.8.3-4.el10) libhandy1-devel ( =  1.8.3-4.el10) libhandy1-devel(x86-64) ( =  1.8.3-4.el10) pkgconfig(libhandy-1) ( =  1.8.3)"
