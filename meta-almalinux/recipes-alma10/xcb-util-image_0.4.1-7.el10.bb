
PN = "xcb-util-image"
PE = "0"
PV = "0.4.1"
PR = "7.el10"
PACKAGES = "xcb-util-image xcb-util-image-devel"


URI_xcb-util-image = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-image-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-image = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libxcb.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libxcb-util.so.1()(64bit) ( )"
RPROVIDES:xcb-util-image = "libxcb-image.so.0()(64bit) ( ) xcb-util-image(x86-64) ( =  0.4.1-7.el10) xcb-util-image ( =  0.4.1-7.el10)"

URI_xcb-util-image-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-image-devel-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-image-devel = "/usr/bin/pkg-config ( ) pkgconfig(xcb) ( ) libxcb-image.so.0()(64bit) ( ) pkgconfig(xcb-shm) ( ) xcb-util-image(x86-64) ( =  0.4.1-7.el10)"
RPROVIDES:xcb-util-image-devel = "pkgconfig(xcb-image) ( =  0.4.1) xcb-util-image-devel ( =  0.4.1-7.el10) xcb-util-image-devel(x86-64) ( =  0.4.1-7.el10)"
