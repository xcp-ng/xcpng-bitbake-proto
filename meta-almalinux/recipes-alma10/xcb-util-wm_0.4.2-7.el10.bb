
PN = "xcb-util-wm"
PE = "0"
PV = "0.4.2"
PR = "7.el10"
PACKAGES = "xcb-util-wm xcb-util-wm-devel"


URI_xcb-util-wm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-wm-0.4.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-wm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libxcb.so.1()(64bit) ( )"
RPROVIDES:xcb-util-wm = "libxcb-icccm.so.4()(64bit) ( ) libxcb-ewmh.so.2()(64bit) ( ) xcb-util-wm ( =  0.4.2-7.el10) xcb-util-wm(x86-64) ( =  0.4.2-7.el10)"

URI_xcb-util-wm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xcb-util-wm-devel-0.4.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-wm-devel = "/usr/bin/pkg-config ( ) pkgconfig(xcb) ( ) libxcb-ewmh.so.2()(64bit) ( ) libxcb-icccm.so.4()(64bit) ( ) xcb-util-wm(x86-64) ( =  0.4.2-7.el10)"
RPROVIDES:xcb-util-wm-devel = "pkgconfig(xcb-ewmh) ( =  0.4.2) pkgconfig(xcb-icccm) ( =  0.4.2) xcb-util-wm-devel ( =  0.4.2-7.el10) xcb-util-wm-devel(x86-64) ( =  0.4.2-7.el10)"
