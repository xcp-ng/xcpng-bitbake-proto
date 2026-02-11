
PN = "Xaw3d"
PE = "0"
PV = "1.6.5"
PR = "5.el10"
PACKAGES = "Xaw3d Xaw3d-devel"


URI_Xaw3d = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/Xaw3d-1.6.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:Xaw3d = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libXt.so.6()(64bit) ( ) libXmu.so.6()(64bit) ( ) libXpm.so.4()(64bit) ( )"
RPROVIDES:Xaw3d = "libXaw3d.so.8()(64bit) ( ) Xaw3d ( =  1.6.5-5.el10) Xaw3d(x86-64) ( =  1.6.5-5.el10)"

URI_Xaw3d-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/Xaw3d-devel-1.6.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:Xaw3d-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xext) ( ) libSM-devel ( ) libX11-devel ( ) libXaw3d.so.8()(64bit) ( ) libXext-devel ( ) libXmu-devel ( ) libXpm-devel ( ) libXt-devel ( ) pkgconfig(xmu) ( ) pkgconfig(xt) ( ) Xaw3d ( =  1.6.5-5.el10)"
RPROVIDES:Xaw3d-devel = "Xaw3d-devel ( =  1.6.5-5.el10) Xaw3d-devel(x86-64) ( =  1.6.5-5.el10) pkgconfig(xaw3d) ( =  1.6.5)"
