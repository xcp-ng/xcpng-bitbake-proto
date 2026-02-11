
PN = "libmpeg2"
PE = "0"
PV = "0.5.1"
PR = "31.el10"
PACKAGES = "libmpeg2 libmpeg2-devel mpeg2dec"


URI_libmpeg2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmpeg2-0.5.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmpeg2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libmpeg2 = "libmpeg2.so.0()(64bit) ( ) libmpeg2convert.so.0()(64bit) ( ) libmpeg2 ( =  0.5.1-31.el10) libmpeg2(x86-64) ( =  0.5.1-31.el10)"

URI_libmpeg2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmpeg2-devel-0.5.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmpeg2-devel = "/usr/bin/pkg-config ( ) libmpeg2.so.0()(64bit) ( ) libmpeg2convert.so.0()(64bit) ( ) libmpeg2(x86-64) ( =  0.5.1-31.el10)"
RPROVIDES:libmpeg2-devel = "libmpeg2-devel ( =  0.5.1-31.el10) libmpeg2-devel(x86-64) ( =  0.5.1-31.el10) pkgconfig(libmpeg2) ( =  0.5.1) pkgconfig(libmpeg2convert) ( =  0.5.1)"

URI_mpeg2dec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mpeg2dec-0.5.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpeg2dec = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libSDL-1.2.so.0()(64bit) ( ) libXv.so.1()(64bit) ( ) libmpeg2.so.0()(64bit) ( ) libmpeg2convert.so.0()(64bit) ( ) libmpeg2(x86-64) ( =  0.5.1-31.el10)"
RPROVIDES:mpeg2dec = "mpeg2dec ( =  0.5.1-31.el10) mpeg2dec(x86-64) ( =  0.5.1-31.el10)"
