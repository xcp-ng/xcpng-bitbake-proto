
PN = "xcb-util-renderutil"
PE = "0"
PV = "0.3.10"
PR = "7.el10"
PACKAGES = "xcb-util-renderutil xcb-util-renderutil-devel"


URI_xcb-util-renderutil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-renderutil-0.3.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-renderutil = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libxcb.so.1()(64bit) ( ) libxcb-render.so.0()(64bit) ( )"
RPROVIDES:xcb-util-renderutil = "libxcb-render-util.so.0()(64bit) ( ) xcb-util-renderutil(x86-64) ( =  0.3.10-7.el10) xcb-util-renderutil ( =  0.3.10-7.el10)"

URI_xcb-util-renderutil-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-renderutil-devel-0.3.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-renderutil-devel = "/usr/bin/pkg-config ( ) pkgconfig(xcb) ( ) libxcb-render-util.so.0()(64bit) ( ) pkgconfig(xcb-render) ( ) xcb-util-renderutil(x86-64) ( =  0.3.10-7.el10)"
RPROVIDES:xcb-util-renderutil-devel = "pkgconfig(xcb-renderutil) ( =  0.3.10) xcb-util-renderutil-devel ( =  0.3.10-7.el10) xcb-util-renderutil-devel(x86-64) ( =  0.3.10-7.el10)"
