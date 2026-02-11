
PN = "xcb-util-cursor"
PE = "0"
PV = "0.1.4"
PR = "6.el10"
PACKAGES = "xcb-util-cursor xcb-util-cursor-devel"


URI_xcb-util-cursor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-cursor-0.1.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-cursor = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxcb.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libxcb-render.so.0()(64bit) ( ) libxcb-image.so.0()(64bit) ( ) libxcb-render-util.so.0()(64bit) ( )"
RPROVIDES:xcb-util-cursor = "libxcb-cursor.so.0()(64bit) ( ) xcb-util-cursor(x86-64) ( =  0.1.4-6.el10) xcb-util-cursor ( =  0.1.4-6.el10)"

URI_xcb-util-cursor-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-cursor-devel-0.1.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-cursor-devel = "/usr/bin/pkg-config ( ) pkgconfig(xcb) ( ) pkgconfig(xcb-render) ( ) libxcb-cursor.so.0()(64bit) ( ) pkgconfig(xcb-image) ( ) pkgconfig(xcb-renderutil) ( ) xcb-util-cursor(x86-64) ( =  0.1.4-6.el10)"
RPROVIDES:xcb-util-cursor-devel = "pkgconfig(xcb-cursor) ( =  0.1.4) xcb-util-cursor-devel ( =  0.1.4-6.el10) xcb-util-cursor-devel(x86-64) ( =  0.1.4-6.el10)"
