
PN = "libXext"
PE = "0"
PV = "1.3.6"
PR = "3.el10"
PACKAGES = "libXext libXext-devel"


URI_libXext = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXext-1.3.6-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXext = "rtld(GNU_HASH) ( ) libX11.so.6()(64bit) ( ) libc.so.6(GLIBC_2.26)(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXext = "libXext.so.6()(64bit) ( ) libXext ( =  1.3.6-3.el10) libXext(x86-64) ( =  1.3.6-3.el10)"

URI_libXext-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXext-devel-1.3.6-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXext-devel = "/usr/bin/pkg-config ( ) libXext.so.6()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xextproto) ( ) libXext ( =  1.3.6-3.el10)"
RPROVIDES:libXext-devel = "libXext-devel ( =  1.3.6-3.el10) libXext-devel(x86-64) ( =  1.3.6-3.el10) pkgconfig(xext) ( =  1.3.6)"
