
PN = "libXmu"
PE = "0"
PV = "1.1.4"
PR = "8.el10"
PACKAGES = "libXmu libXmu-devel"


URI_libXmu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXmu-1.1.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXmu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libXt.so.6()(64bit) ( )"
RPROVIDES:libXmu = "libXmu.so.6()(64bit) ( ) libXmuu.so.1()(64bit) ( ) libXmu ( =  1.1.4-8.el10) libXmu(x86-64) ( =  1.1.4-8.el10)"

URI_libXmu-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXmu-devel-1.1.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXmu-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xext) ( ) libXmu.so.6()(64bit) ( ) libXmuu.so.1()(64bit) ( ) pkgconfig(xt) ( ) libXmu ( =  1.1.4-8.el10)"
RPROVIDES:libXmu-devel = "libXmu-devel ( =  1.1.4-8.el10) libXmu-devel(x86-64) ( =  1.1.4-8.el10) pkgconfig(xmu) ( =  1.1.4) pkgconfig(xmuu) ( =  1.1.4)"
