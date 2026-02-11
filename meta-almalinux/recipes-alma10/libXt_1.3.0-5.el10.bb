
PN = "libXt"
PE = "0"
PV = "1.3.0"
PR = "5.el10"
PACKAGES = "libXt libXt-devel"


URI_libXt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXt-1.3.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libICE.so.6()(64bit) ( ) libSM.so.6()(64bit) ( ) libX11(x86-64) ( >=  1.6)"
RPROVIDES:libXt = "libXt.so.6()(64bit) ( ) libXt(x86-64) ( =  1.3.0-5.el10) libXt ( =  1.3.0-5.el10)"

URI_libXt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXt-devel-1.3.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXt-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) libXt.so.6()(64bit) ( ) pkgconfig(ice) ( ) pkgconfig(sm) ( ) libXt(x86-64) ( =  1.3.0-5.el10)"
RPROVIDES:libXt-devel = "libXt-devel ( =  1.3.0-5.el10) libXt-devel(x86-64) ( =  1.3.0-5.el10) pkgconfig(xt) ( =  1.3.0)"
