
PN = "libXv"
PE = "0"
PV = "1.0.12"
PR = "5.el10"
PACKAGES = "libXv libXv-devel"


URI_libXv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXv-1.0.12-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXv = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXv = "libXv.so.1()(64bit) ( ) libXv ( =  1.0.12-5.el10) libXv(x86-64) ( =  1.0.12-5.el10)"

URI_libXv-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXv-devel-1.0.12-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXv-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xext) ( ) libXv.so.1()(64bit) ( ) pkgconfig(videoproto) ( ) libXv ( =  1.0.12-5.el10)"
RPROVIDES:libXv-devel = "libXv-devel ( =  1.0.12-5.el10) libXv-devel(x86-64) ( =  1.0.12-5.el10) pkgconfig(xv) ( =  1.0.12)"
