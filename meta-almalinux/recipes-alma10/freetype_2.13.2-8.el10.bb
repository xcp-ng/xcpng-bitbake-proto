
PN = "freetype"
PE = "0"
PV = "2.13.2"
PR = "8.el10"
PACKAGES = "freetype freetype-devel freetype-demos"


URI_freetype = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/freetype-2.13.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freetype = "rtld(GNU_HASH) ( ) /bin/sh ( ) libz.so.1()(64bit) ( ) libbz2.so.1()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libbrotlidec.so.1()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( )"
RPROVIDES:freetype = "libfreetype.so.6()(64bit) ( ) freetype-bytecode ( ) freetype-subpixel ( ) freetype ( =  2.13.2-8.el10) freetype(x86-64) ( =  2.13.2-8.el10)"

URI_freetype-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freetype-devel-2.13.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freetype-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) libfreetype.so.6()(64bit) ( ) pkgconfig(zlib) ( ) pkgconfig(libbrotlidec) ( ) pkgconfig(libpng) ( ) pkgconfig(bzip2) ( ) pkgconf(x86-64) ( ) freetype ( =  2.13.2-8.el10) pkgconfig(harfbuzz) ( >=  2.0.0)"
RPROVIDES:freetype-devel = "freetype-devel ( =  2.13.2-8.el10) freetype-devel(x86-64) ( =  2.13.2-8.el10) pkgconfig(freetype2) ( =  26.1.20)"

URI_freetype-demos = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freetype-demos-2.13.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freetype-demos = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libX11.so.6()(64bit) ( ) libfreetype.so.6()(64bit) ( ) freetype ( =  2.13.2-8.el10)"
RPROVIDES:freetype-demos = "freetype-demos ( =  2.13.2-8.el10) freetype-demos(x86-64) ( =  2.13.2-8.el10)"
