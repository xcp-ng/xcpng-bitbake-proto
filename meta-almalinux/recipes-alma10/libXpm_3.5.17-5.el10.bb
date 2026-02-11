
PN = "libXpm"
PE = "0"
PV = "3.5.17"
PR = "5.el10"
PACKAGES = "libXpm libXpm-devel"


URI_libXpm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXpm-3.5.17-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXpm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( )"
RPROVIDES:libXpm = "libXpm.so.4()(64bit) ( ) libXpm ( =  3.5.17-5.el10) libXpm(x86-64) ( =  3.5.17-5.el10)"

URI_libXpm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXpm-devel-3.5.17-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXpm-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/pkg-config ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) pkgconfig(x11) ( ) libXt.so.6()(64bit) ( ) libXpm.so.4()(64bit) ( ) libXpm ( =  3.5.17-5.el10)"
RPROVIDES:libXpm-devel = "libXpm-devel ( =  3.5.17-5.el10) libXpm-devel(x86-64) ( =  3.5.17-5.el10) pkgconfig(xpm) ( =  3.5.17)"
