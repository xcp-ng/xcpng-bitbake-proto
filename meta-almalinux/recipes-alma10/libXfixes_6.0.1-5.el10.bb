
PN = "libXfixes"
PE = "0"
PV = "6.0.1"
PR = "5.el10"
PACKAGES = "libXfixes libXfixes-devel"


URI_libXfixes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXfixes-6.0.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXfixes = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libX11 ( >=  1.6)"
RPROVIDES:libXfixes = "libXfixes.so.3()(64bit) ( ) libXfixes ( =  6.0.1-5.el10) libXfixes(x86-64) ( =  6.0.1-5.el10)"

URI_libXfixes-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXfixes-devel-6.0.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXfixes-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libXfixes.so.3()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) libXfixes ( =  6.0.1-5.el10) pkgconfig(fixesproto) ( >=  6.0)"
RPROVIDES:libXfixes-devel = "libXfixes-devel ( =  6.0.1-5.el10) libXfixes-devel(x86-64) ( =  6.0.1-5.el10) pkgconfig(xfixes) ( =  6.0.1)"
