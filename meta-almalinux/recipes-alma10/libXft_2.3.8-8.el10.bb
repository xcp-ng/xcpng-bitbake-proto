
PN = "libXft"
PE = "0"
PV = "2.3.8"
PR = "8.el10"
PACKAGES = "libXft libXft-devel"


URI_libXft = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXft-2.3.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXft = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libXrender.so.1()(64bit) ( ) fontconfig ( >=  2.2-1)"
RPROVIDES:libXft = "libXft.so.2()(64bit) ( ) libXft ( =  2.3.8-8.el10) libXft(x86-64) ( =  2.3.8-8.el10)"

URI_libXft-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXft-devel-2.3.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXft-devel = "/usr/bin/pkg-config ( ) pkgconfig(xproto) ( ) pkgconfig(freetype2) ( ) libXft.so.2()(64bit) ( ) pkgconfig(xrender) ( ) pkgconfig(fontconfig) ( ) libXft ( =  2.3.8-8.el10)"
RPROVIDES:libXft-devel = "libXft-devel ( =  2.3.8-8.el10) libXft-devel(x86-64) ( =  2.3.8-8.el10) pkgconfig(xft) ( =  2.3.8)"
