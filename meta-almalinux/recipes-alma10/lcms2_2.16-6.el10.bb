
PN = "lcms2"
PE = "0"
PV = "2.16"
PR = "6.el10"
PACKAGES = "lcms2 lcms2-devel lcms2-utils"


URI_lcms2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lcms2-2.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lcms2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:lcms2 = "liblcms2.so.2()(64bit) ( ) lcms2(x86-64) ( =  2.16-6.el10) lcms2 ( =  2.16-6.el10)"

URI_lcms2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lcms2-devel-2.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lcms2-devel = "/usr/bin/pkg-config ( ) liblcms2.so.2()(64bit) ( ) lcms2(x86-64) ( =  2.16-6.el10)"
RPROVIDES:lcms2-devel = "lcms2-devel ( =  2.16-6.el10) lcms2-devel(x86-64) ( =  2.16-6.el10) littlecms-devel ( =  2.16-6.el10) pkgconfig(lcms2) ( =  2.16)"

URI_lcms2-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lcms2-utils-2.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lcms2-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) liblcms2.so.2()(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) lcms2(x86-64) ( =  2.16-6.el10)"
RPROVIDES:lcms2-utils = "lcms2-utils ( =  2.16-6.el10) lcms2-utils(x86-64) ( =  2.16-6.el10)"
