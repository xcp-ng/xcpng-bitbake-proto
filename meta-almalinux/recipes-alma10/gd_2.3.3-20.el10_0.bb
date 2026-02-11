
PN = "gd"
PE = "0"
PV = "2.3.3"
PR = "20.el10_0"
PACKAGES = "gd gd-devel gd-progs"


URI_gd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gd-2.3.3-20.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gd = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libwebp.so.7()(64bit) ( ) libXpm.so.4()(64bit) ( )"
RPROVIDES:gd = "libgd.so.3()(64bit) ( ) gd(x86-64) ( =  2.3.3-20.el10_0) gd ( =  2.3.3-20.el10_0)"

URI_gd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gd-devel-2.3.3-20.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gd-devel = "/usr/bin/pkg-config ( ) pkgconfig(zlib) ( ) libgd.so.3()(64bit) ( ) zlib-devel(x86-64) ( ) pkgconfig(libjpeg) ( ) pkgconfig(libpng) ( ) pkgconfig(fontconfig) ( ) libX11-devel(x86-64) ( ) pkgconfig(libtiff-4) ( ) fontconfig-devel(x86-64) ( ) freetype-devel(x86-64) ( ) libtiff-devel(x86-64) ( ) pkgconfig(xpm) ( ) libXpm-devel(x86-64) ( ) libjpeg-devel(x86-64) ( ) libpng-devel(x86-64) ( ) libwebp-devel(x86-64) ( ) gd(x86-64) ( =  2.3.3-20.el10_0) pkgconfig(libwebp) ( >=  0.2.0) pkgconfig(freetype2) ( >=  9.8.3)"
RPROVIDES:gd-devel = "gd-devel ( =  2.3.3-20.el10_0) gd-devel(x86-64) ( =  2.3.3-20.el10_0) pkgconfig(gdlib) ( =  2.3.3)"

URI_gd-progs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gd-progs-2.3.3-20.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gd-progs = "rtld(GNU_HASH) ( ) perl(strict) ( ) /usr/bin/perl ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgd.so.3()(64bit) ( ) gd(x86-64) ( =  2.3.3-20.el10_0)"
RPROVIDES:gd-progs = "gd-progs ( =  2.3.3-20.el10_0) gd-progs(x86-64) ( =  2.3.3-20.el10_0)"
