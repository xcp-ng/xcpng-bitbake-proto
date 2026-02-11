
PN = "libXtst"
PE = "0"
PV = "1.2.4"
PR = "8.el10"
PACKAGES = "libXtst libXtst-devel"


URI_libXtst = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXtst-1.2.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXtst = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libXi.so.6()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXtst = "libXtst.so.6()(64bit) ( ) libXtst(x86-64) ( =  1.2.4-8.el10) libXtst ( =  1.2.4-8.el10)"

URI_libXtst-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXtst-devel-1.2.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXtst-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libXtst.so.6()(64bit) ( ) pkgconfig(xext) ( ) pkgconfig(xextproto) ( ) pkgconfig(xi) ( ) libXi-devel(x86-64) ( ) pkgconfig(recordproto) ( ) libXtst(x86-64) ( =  1.2.4-8.el10)"
RPROVIDES:libXtst-devel = "libXtst-devel ( =  1.2.4-8.el10) libXtst-devel(x86-64) ( =  1.2.4-8.el10) pkgconfig(xtst) ( =  1.2.4)"
