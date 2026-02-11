
PN = "libffi"
PE = "0"
PV = "3.4.4"
PR = "9.el10"
PACKAGES = "libffi libffi-devel"


URI_libffi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libffi-3.4.4-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libffi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libffi = "libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_COMPLEX_8.0)(64bit) ( ) libffi.so.8(LIBFFI_GO_CLOSURE_8.0)(64bit) ( ) libffi ( =  3.4.4-9.el10) libffi(x86-64) ( =  3.4.4-9.el10)"

URI_libffi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libffi-devel-3.4.4-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libffi-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libffi.so.8()(64bit) ( ) libffi ( =  3.4.4-9.el10)"
RPROVIDES:libffi-devel = "libffi-devel ( =  3.4.4-9.el10) libffi-devel(x86-64) ( =  3.4.4-9.el10) pkgconfig(libffi) ( =  3.4.4)"
