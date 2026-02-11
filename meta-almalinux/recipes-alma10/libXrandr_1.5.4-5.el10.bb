
PN = "libXrandr"
PE = "0"
PV = "1.5.4"
PR = "5.el10"
PACKAGES = "libXrandr libXrandr-devel"


URI_libXrandr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrandr-1.5.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXrandr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libXrender.so.1()(64bit) ( ) libX11 ( >=  1.6.0)"
RPROVIDES:libXrandr = "libXrandr.so.2()(64bit) ( ) libXrandr ( =  1.5.4-5.el10) libXrandr(x86-64) ( =  1.5.4-5.el10)"

URI_libXrandr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrandr-devel-1.5.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXrandr-devel = "/usr/bin/pkg-config ( ) libXrandr.so.2()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xext) ( ) pkgconfig(xrender) ( ) libXrandr ( =  1.5.4-5.el10) pkgconfig(randrproto) ( >=  1.5)"
RPROVIDES:libXrandr-devel = "libXrandr-devel ( =  1.5.4-5.el10) libXrandr-devel(x86-64) ( =  1.5.4-5.el10) pkgconfig(xrandr) ( =  1.5.4)"
