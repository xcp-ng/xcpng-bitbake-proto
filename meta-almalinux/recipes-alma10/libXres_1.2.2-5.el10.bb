
PN = "libXres"
PE = "0"
PV = "1.2.2"
PR = "5.el10"
PACKAGES = "libXres libXres-devel"


URI_libXres = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXres-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXres = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXres = "libXRes.so.1()(64bit) ( ) libXres ( =  1.2.2-5.el10) libXres(x86-64) ( =  1.2.2-5.el10)"

URI_libXres-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXres-devel-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXres-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xext) ( ) libXRes.so.1()(64bit) ( ) libXres ( =  1.2.2-5.el10)"
RPROVIDES:libXres-devel = "libXres-devel ( =  1.2.2-5.el10) libXres-devel(x86-64) ( =  1.2.2-5.el10) pkgconfig(xres) ( =  1.2.2)"
