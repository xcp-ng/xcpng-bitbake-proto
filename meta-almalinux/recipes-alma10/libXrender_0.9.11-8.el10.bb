
PN = "libXrender"
PE = "0"
PV = "0.9.11"
PR = "8.el10"
PACKAGES = "libXrender libXrender-devel"


URI_libXrender = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrender-0.9.11-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXrender = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXrender = "libXrender.so.1()(64bit) ( ) libXrender ( =  0.9.11-8.el10) libXrender(x86-64) ( =  0.9.11-8.el10)"

URI_libXrender-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXrender-devel-0.9.11-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXrender-devel = "/usr/bin/pkg-config ( ) libXrender.so.1()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) libXrender ( =  0.9.11-8.el10) pkgconfig(renderproto) ( >=  0.9)"
RPROVIDES:libXrender-devel = "libXrender-devel ( =  0.9.11-8.el10) libXrender-devel(x86-64) ( =  0.9.11-8.el10) pkgconfig(xrender) ( =  0.9.11)"
