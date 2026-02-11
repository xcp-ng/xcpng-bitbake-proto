
PN = "libXinerama"
PE = "0"
PV = "1.1.5"
PR = "8.el10"
PACKAGES = "libXinerama libXinerama-devel"


URI_libXinerama = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXinerama-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXinerama = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXinerama = "libXinerama.so.1()(64bit) ( ) libXinerama ( =  1.1.5-8.el10) libXinerama(x86-64) ( =  1.1.5-8.el10)"

URI_libXinerama-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXinerama-devel-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXinerama-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libXinerama.so.1()(64bit) ( ) pkgconfig(xext) ( ) pkgconfig(xineramaproto) ( ) libXinerama ( =  1.1.5-8.el10)"
RPROVIDES:libXinerama-devel = "libXinerama-devel ( =  1.1.5-8.el10) libXinerama-devel(x86-64) ( =  1.1.5-8.el10) pkgconfig(xinerama) ( =  1.1.5)"
