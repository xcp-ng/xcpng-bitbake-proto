
PN = "libXcursor"
PE = "0"
PV = "1.2.1"
PR = "9.el10"
PACKAGES = "libXcursor libXcursor-devel"


URI_libXcursor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcursor-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXcursor = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libXfixes.so.3()(64bit) ( ) libXrender.so.1()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXcursor = "libXcursor.so.1()(64bit) ( ) libXcursor ( =  1.2.1-9.el10) libXcursor(x86-64) ( =  1.2.1-9.el10)"

URI_libXcursor-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcursor-devel-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXcursor-devel = "/usr/bin/pkg-config ( ) libXcursor.so.1()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xfixes) ( ) pkgconfig(xrender) ( ) libXcursor ( =  1.2.1-9.el10)"
RPROVIDES:libXcursor-devel = "libXcursor-devel ( =  1.2.1-9.el10) libXcursor-devel(x86-64) ( =  1.2.1-9.el10) pkgconfig(xcursor) ( =  1.2.1)"
