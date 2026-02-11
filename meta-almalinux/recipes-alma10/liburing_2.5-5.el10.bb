
PN = "liburing"
PE = "0"
PV = "2.5"
PR = "5.el10"
PACKAGES = "liburing liburing-devel"


URI_liburing = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/liburing-2.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liburing = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:liburing = "liburing.so.2()(64bit) ( ) liburing.so.2(LIBURING_2.0)(64bit) ( ) liburing-ffi.so.2()(64bit) ( ) liburing-ffi.so.2(LIBURING_2.4)(64bit) ( ) liburing-ffi.so.2(LIBURING_2.5)(64bit) ( ) liburing.so.2(LIBURING_2.1)(64bit) ( ) liburing.so.2(LIBURING_2.2)(64bit) ( ) liburing.so.2(LIBURING_2.3)(64bit) ( ) liburing.so.2(LIBURING_2.4)(64bit) ( ) liburing.so.2(LIBURING_2.5)(64bit) ( ) liburing ( =  2.5-5.el10) liburing(x86-64) ( =  2.5-5.el10)"

URI_liburing-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liburing-devel-2.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liburing-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) liburing-ffi.so.2()(64bit) ( ) liburing.so.2()(64bit) ( ) liburing(x86-64) ( =  2.5-5.el10)"
RPROVIDES:liburing-devel = "liburing-devel ( =  2.5-5.el10) liburing-devel(x86-64) ( =  2.5-5.el10) pkgconfig(liburing) ( =  2.5) pkgconfig(liburing-ffi) ( =  2.5)"
