
PN = "libX11"
PE = "0"
PV = "1.8.10"
PR = "1.el10"
PACKAGES = "libX11 libX11-common libX11-devel libX11-xcb"


URI_libX11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-1.8.10-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libX11 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxcb.so.1()(64bit) ( ) libX11-common ( >=  1.8.10-1.el10)"
RPROVIDES:libX11 = "libX11.so.6()(64bit) ( ) libX11 ( =  1.8.10-1.el10) libX11(x86-64) ( =  1.8.10-1.el10)"

URI_libX11-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-common-1.8.10-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libX11-common = ""
RPROVIDES:libX11-common = "libX11-common ( =  1.8.10-1.el10)"

URI_libX11-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-devel-1.8.10-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libX11-devel = "/usr/bin/pkg-config ( ) libX11.so.6()(64bit) ( ) libX11-xcb.so.1()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(kbproto) ( ) libX11 ( =  1.8.10-1.el10) libX11-xcb ( =  1.8.10-1.el10) pkgconfig(xcb) ( >=  1.11.1)"
RPROVIDES:libX11-devel = "libX11-devel ( =  1.8.10-1.el10) libX11-devel(x86-64) ( =  1.8.10-1.el10) pkgconfig(x11) ( =  1.8.10) pkgconfig(x11-xcb) ( =  1.8.10)"

URI_libX11-xcb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libX11-xcb-1.8.10-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libX11-xcb = "rtld(GNU_HASH) ( )"
RPROVIDES:libX11-xcb = "libX11-xcb.so.1()(64bit) ( ) libX11-xcb ( =  1.8.10-1.el10) libX11-xcb(x86-64) ( =  1.8.10-1.el10)"
