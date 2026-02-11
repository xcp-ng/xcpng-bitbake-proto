
PN = "xkbcomp"
PE = "0"
PV = "1.4.7"
PR = "3.el10"
PACKAGES = "xkbcomp xkbcomp-devel"


URI_xkbcomp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xkbcomp-1.4.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xkbcomp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libxkbfile.so.1()(64bit) ( )"
RPROVIDES:xkbcomp = "xkbcomp ( =  1.4.7-3.el10) xkbcomp(x86-64) ( =  1.4.7-3.el10)"

URI_xkbcomp-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xkbcomp-devel-1.4.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xkbcomp-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) xkbcomp(x86-64) ( =  1.4.7-3.el10)"
RPROVIDES:xkbcomp-devel = "pkgconfig(xkbcomp) ( =  1.4.7) xkbcomp-devel ( =  1.4.7-3.el10) xkbcomp-devel(x86-64) ( =  1.4.7-3.el10)"
