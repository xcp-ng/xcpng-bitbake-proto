
PN = "libcap"
PE = "0"
PV = "2.69"
PR = "7.el10"
PACKAGES = "libcap libcap-devel libcap-static"


URI_libcap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcap-2.69-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( )"
RPROVIDES:libcap = "libcap.so.2()(64bit) ( ) libpsx.so.2()(64bit) ( ) libcap ( =  2.69-7.el10) libcap(x86-64) ( =  2.69-7.el10)"

URI_libcap-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcap-devel-2.69-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-devel = "/usr/bin/pkg-config ( ) libcap.so.2()(64bit) ( ) libpsx.so.2()(64bit) ( ) libcap ( =  2.69-7.el10)"
RPROVIDES:libcap-devel = "libcap-devel ( =  2.69-7.el10) libcap-devel(x86-64) ( =  2.69-7.el10) pkgconfig(libcap) ( =  2.69) pkgconfig(libpsx) ( =  2.69)"

URI_libcap-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcap-static-2.69-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-static = "libcap ( =  2.69-7.el10)"
RPROVIDES:libcap-static = "libcap-static ( =  2.69-7.el10) libcap-static(x86-64) ( =  2.69-7.el10)"
