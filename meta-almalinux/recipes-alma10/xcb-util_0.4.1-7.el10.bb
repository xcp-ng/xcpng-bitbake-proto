
PN = "xcb-util"
PE = "0"
PV = "0.4.1"
PR = "7.el10"
PACKAGES = "xcb-util xcb-util-devel"


URI_xcb-util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util = "rtld(GNU_HASH) ( ) libxcb.so.1()(64bit) ( ) libc.so.6(GLIBC_2.8)(64bit) ( )"
RPROVIDES:xcb-util = "libxcb-util.so.1()(64bit) ( ) xcb-util ( =  0.4.1-7.el10) xcb-util(x86-64) ( =  0.4.1-7.el10)"

URI_xcb-util-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xcb-util-devel-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-devel = "/usr/bin/pkg-config ( ) pkgconfig(xcb) ( ) libxcb-util.so.1()(64bit) ( ) xcb-util ( =  0.4.1-7.el10)"
RPROVIDES:xcb-util-devel = "pkgconfig(xcb-atom) ( =  0.4.1) pkgconfig(xcb-aux) ( =  0.4.1) pkgconfig(xcb-event) ( =  0.4.1) pkgconfig(xcb-util) ( =  0.4.1) xcb-util-devel ( =  0.4.1-7.el10) xcb-util-devel(x86-64) ( =  0.4.1-7.el10)"
