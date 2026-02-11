
PN = "libotf"
PE = "0"
PV = "0.9.16"
PR = "6.el10"
PACKAGES = "libotf libotf-devel"


URI_libotf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libotf-0.9.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libotf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libX11.so.6()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libXt.so.6()(64bit) ( ) libXaw.so.7()(64bit) ( ) freetype ( )"
RPROVIDES:libotf = "libotf.so.1()(64bit) ( ) libotf ( =  0.9.16-6.el10) libotf(x86-64) ( =  0.9.16-6.el10)"

URI_libotf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libotf-devel-0.9.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libotf-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libotf.so.1()(64bit) ( ) pkgconfig(freetype2) ( ) libotf ( =  0.9.16-6.el10)"
RPROVIDES:libotf-devel = "libotf-devel ( =  0.9.16-6.el10) libotf-devel(x86-64) ( =  0.9.16-6.el10) pkgconfig(libotf) ( =  0.9.16)"
