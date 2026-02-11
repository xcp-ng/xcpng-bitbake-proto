
PN = "libXaw"
PE = "0"
PV = "1.0.15"
PR = "5.el10"
PACKAGES = "libXaw libXaw-devel"


URI_libXaw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXaw-1.0.15-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXaw = "rtld(GNU_HASH) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libXt.so.6()(64bit) ( ) libXmu.so.6()(64bit) ( ) libXpm.so.4()(64bit) ( ) libc.so.6(GLIBC_2.15)(64bit) ( )"
RPROVIDES:libXaw = "libXaw.so.7()(64bit) ( ) libXaw ( =  1.0.15-5.el10) libXaw(x86-64) ( =  1.0.15-5.el10)"

URI_libXaw-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXaw-devel-1.0.15-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXaw-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xext) ( ) libXaw.so.7()(64bit) ( ) pkgconfig(xpm) ( ) pkgconfig(xt) ( ) pkgconfig(xmu) ( ) libXaw ( =  1.0.15-5.el10)"
RPROVIDES:libXaw-devel = "libXaw-devel ( =  1.0.15-5.el10) libXaw-devel(x86-64) ( =  1.0.15-5.el10) pkgconfig(xaw7) ( =  1.0.15)"
