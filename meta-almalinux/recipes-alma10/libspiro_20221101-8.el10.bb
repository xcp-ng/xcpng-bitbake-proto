
PN = "libspiro"
PE = "0"
PV = "20221101"
PR = "8.el10"
PACKAGES = "libspiro libspiro-devel"


URI_libspiro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libspiro-20221101-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspiro = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( )"
RPROVIDES:libspiro = "libspiro.so.1()(64bit) ( ) libspiro ( =  20221101-8.el10) libspiro(x86-64) ( =  20221101-8.el10)"

URI_libspiro-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libspiro-devel-20221101-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspiro-devel = "/usr/bin/pkg-config ( ) libspiro.so.1()(64bit) ( ) libspiro(x86-64) ( =  20221101-8.el10)"
RPROVIDES:libspiro-devel = "libspiro-devel ( =  20221101-8.el10) libspiro-devel(x86-64) ( =  20221101-8.el10) pkgconfig(libspiro) ( =  20221101)"
