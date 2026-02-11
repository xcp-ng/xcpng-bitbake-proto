
PN = "libXfont2"
PE = "0"
PV = "2.0.6"
PR = "5.el10"
PACKAGES = "libXfont2 libXfont2-devel"


URI_libXfont2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXfont2-2.0.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXfont2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libfreetype.so.6()(64bit) ( ) libfontenc.so.1()(64bit) ( )"
RPROVIDES:libXfont2 = "libXfont2.so.2()(64bit) ( ) libXfont2 ( =  2.0.6-5.el10) libXfont2(x86-64) ( =  2.0.6-5.el10)"

URI_libXfont2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXfont2-devel-2.0.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXfont2-devel = "/usr/bin/pkg-config ( ) pkgconfig(zlib) ( ) pkgconfig(xproto) ( ) libfontenc-devel(x86-64) ( ) pkgconfig(fontenc) ( ) libXfont2.so.2()(64bit) ( ) pkgconfig(fontsproto) ( ) pkgconfig(freetype2) ( ) libXfont2(x86-64) ( =  2.0.6-5.el10)"
RPROVIDES:libXfont2-devel = "libXfont2-devel ( =  2.0.6-5.el10) libXfont2-devel(x86-64) ( =  2.0.6-5.el10) pkgconfig(xfont2) ( =  2.0.6)"
