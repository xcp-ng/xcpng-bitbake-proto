
PN = "leptonica"
PE = "0"
PV = "1.84.1"
PR = "5.el10"
PACKAGES = "leptonica leptonica-devel leptonica-tools"


URI_leptonica = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/leptonica-1.84.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:leptonica = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libwebp.so.7()(64bit) ( ) libwebpmux.so.3()(64bit) ( ) libgif.so.7()(64bit) ( )"
RPROVIDES:leptonica = "libleptonica.so.6()(64bit) ( ) leptonica ( =  1.84.1-5.el10) leptonica(x86-64) ( =  1.84.1-5.el10)"

URI_leptonica-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/leptonica-devel-1.84.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:leptonica-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(zlib) ( ) pkgconfig(libjpeg) ( ) libleptonica.so.6()(64bit) ( ) pkgconfig(libpng) ( ) pkgconfig(libtiff-4) ( ) pkgconfig(libwebp) ( ) pkgconfig(libwebpmux) ( ) leptonica(x86-64) ( =  1.84.1-5.el10)"
RPROVIDES:leptonica-devel = "cmake(Leptonica) ( ) cmake(leptonica) ( ) leptonica-devel ( =  1.84.1-5.el10) leptonica-devel(x86-64) ( =  1.84.1-5.el10) pkgconfig(lept) ( =  1.84.1)"

URI_leptonica-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/leptonica-tools-1.84.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:leptonica-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libleptonica.so.6()(64bit) ( ) leptonica(x86-64) ( =  1.84.1-5.el10)"
RPROVIDES:leptonica-tools = "leptonica-tools ( =  1.84.1-5.el10) leptonica-tools(x86-64) ( =  1.84.1-5.el10)"
