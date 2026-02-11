
PN = "libXi"
PE = "0"
PV = "1.8.1"
PR = "7.el10"
PACKAGES = "libXi libXi-devel"


URI_libXi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXi-1.8.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXi = "libXi.so.6()(64bit) ( ) libXi ( =  1.8.1-7.el10) libXi(x86-64) ( =  1.8.1-7.el10)"

URI_libXi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXi-devel-1.8.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXi-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libXi.so.6()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xext) ( ) pkgconfig(xfixes) ( ) xorg-x11-proto-devel ( ) pkgconfig(inputproto) ( ) libXi ( =  1.8.1-7.el10)"
RPROVIDES:libXi-devel = "libXi-devel ( =  1.8.1-7.el10) libXi-devel(x86-64) ( =  1.8.1-7.el10) pkgconfig(xi) ( =  1.8.1)"
