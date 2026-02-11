
PN = "gcab"
PE = "0"
PV = "1.6"
PR = "7.el10"
PACKAGES = "libgcab1 libgcab1-devel gcab"


URI_libgcab1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgcab1-1.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcab1 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libgcab1 = "libgcab-1.0.so.0()(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.0)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.2)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.5)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.6)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_1.0)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_1.4)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_1.5)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_1.6)(64bit) ( ) libgcab1 ( =  1.6-7.el10) libgcab1(x86-64) ( =  1.6-7.el10)"

URI_libgcab1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgcab1-devel-1.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcab1-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(gio-2.0) ( ) glib2-devel ( ) libgcab-1.0.so.0()(64bit) ( ) libgcab1(x86-64) ( =  1.6-7.el10)"
RPROVIDES:libgcab1-devel = "libgcab1-devel ( =  1.6-7.el10) libgcab1-devel(x86-64) ( =  1.6-7.el10) pkgconfig(libgcab-1.0) ( =  1.6)"

URI_gcab = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gcab-1.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcab = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgcab-1.0.so.0()(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.0)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.2)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.5)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_0.6)(64bit) ( ) libgcab-1.0.so.0(LIBGCAB1_1.4)(64bit) ( ) libgcab1(x86-64) ( =  1.6-7.el10)"
RPROVIDES:gcab = "gcab ( =  1.6-7.el10) gcab(x86-64) ( =  1.6-7.el10)"
