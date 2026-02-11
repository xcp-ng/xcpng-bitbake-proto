
PN = "libdex"
PE = "0"
PV = "0.8.1"
PR = "1.el10"
PACKAGES = "libdex libdex-devel libdex-devel-docs"


URI_libdex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdex-0.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdex = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) liburing.so.2()(64bit) ( ) liburing.so.2(LIBURING_2.0)(64bit) ( ) libatomic.so.1()(64bit) ( ) libatomic.so.1(LIBATOMIC_1.0)(64bit) ( ) liburing.so.2(LIBURING_2.2)(64bit) ( )"
RPROVIDES:libdex = "libdex-1.so.1()(64bit) ( ) libdex ( =  0.8.1-1.el10) libdex(x86-64) ( =  0.8.1-1.el10)"

URI_libdex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdex-devel-0.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdex-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) libdex-1.so.1()(64bit) ( ) libdex(x86-64) ( =  0.8.1-1.el10)"
RPROVIDES:libdex-devel = "libdex-devel ( =  0.8.1-1.el10) libdex-devel(x86-64) ( =  0.8.1-1.el10) pkgconfig(libdex-1) ( =  0.8.1)"

URI_libdex-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdex-devel-docs-0.8.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libdex-devel-docs = "libdex ( =  0.8.1-1.el10)"
RPROVIDES:libdex-devel-docs = "libdex-devel-docs ( =  0.8.1-1.el10)"
