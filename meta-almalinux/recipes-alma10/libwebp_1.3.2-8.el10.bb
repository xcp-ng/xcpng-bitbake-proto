
PN = "libwebp"
PE = "0"
PV = "1.3.2"
PR = "8.el10"
PACKAGES = "libwebp libwebp-devel libwebp-tools"


URI_libwebp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwebp-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwebp = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:libwebp = "libwebp.so.7()(64bit) ( ) libwebpmux.so.3()(64bit) ( ) libwebpdemux.so.2()(64bit) ( ) libwebpdecoder.so.3()(64bit) ( ) libsharpyuv.so.0()(64bit) ( ) libwebp(x86-64) ( =  1.3.2-8.el10) libwebp ( =  1.3.2-8.el10)"

URI_libwebp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwebp-devel-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwebp-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libwebp.so.7()(64bit) ( ) libwebpmux.so.3()(64bit) ( ) libwebpdemux.so.2()(64bit) ( ) libwebpdecoder.so.3()(64bit) ( ) libsharpyuv.so.0()(64bit) ( ) pkgconfig(libsharpyuv) ( ) pkgconfig(libwebp) ( >=  0.2.0) libwebp(x86-64) ( =  1.3.2-8.el10)"
RPROVIDES:libwebp-devel = "cmake(WebP) ( =  1.3.2) cmake(webp) ( =  1.3.2) libwebp-devel ( =  1.3.2-8.el10) libwebp-devel(x86-64) ( =  1.3.2-8.el10) pkgconfig(libsharpyuv) ( =  1.3.2) pkgconfig(libwebp) ( =  1.3.2) pkgconfig(libwebpdecoder) ( =  1.3.2) pkgconfig(libwebpdemux) ( =  1.3.2) pkgconfig(libwebpmux) ( =  1.3.2)"

URI_libwebp-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwebp-tools-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwebp-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libgif.so.7()(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libGLX.so.0()(64bit) ( ) libOpenGL.so.0()(64bit) ( ) libglut.so.3()(64bit) ( ) libsharpyuv.so.0()(64bit) ( ) libwebp.so.7()(64bit) ( ) libwebpdemux.so.2()(64bit) ( ) libwebpmux.so.3()(64bit) ( ) libwebp(x86-64) ( =  1.3.2-8.el10)"
RPROVIDES:libwebp-tools = "libwebp-tools ( =  1.3.2-8.el10) libwebp-tools(x86-64) ( =  1.3.2-8.el10)"
