
PN = "libmng"
PE = "0"
PV = "2.0.3"
PR = "23.el10"
PACKAGES = "libmng libmng-devel"


URI_libmng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmng-2.0.3-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmng = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) liblcms2.so.2()(64bit) ( )"
RPROVIDES:libmng = "libmng.so.2()(64bit) ( ) libmng ( =  2.0.3-23.el10) libmng(x86-64) ( =  2.0.3-23.el10)"

URI_libmng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmng-devel-2.0.3-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmng-devel = "/usr/bin/pkg-config ( ) zlib-devel ( ) libjpeg-devel ( ) libmng.so.2()(64bit) ( ) libmng ( =  2.0.3-23.el10)"
RPROVIDES:libmng-devel = "libmng-devel ( =  2.0.3-23.el10) libmng-devel(x86-64) ( =  2.0.3-23.el10) pkgconfig(libmng) ( =  2.0.2)"
