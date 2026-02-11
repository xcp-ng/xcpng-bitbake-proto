
PN = "xcb-util-keysyms"
PE = "0"
PV = "0.4.1"
PR = "7.el10"
PACKAGES = "xcb-util-keysyms xcb-util-keysyms-devel"


URI_xcb-util-keysyms = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xcb-util-keysyms-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-keysyms = "rtld(GNU_HASH) ( ) libxcb.so.1()(64bit) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( )"
RPROVIDES:xcb-util-keysyms = "libxcb-keysyms.so.1()(64bit) ( ) xcb-util-keysyms ( =  0.4.1-7.el10) xcb-util-keysyms(x86-64) ( =  0.4.1-7.el10)"

URI_xcb-util-keysyms-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xcb-util-keysyms-devel-0.4.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xcb-util-keysyms-devel = "/usr/bin/pkg-config ( ) pkgconfig(xcb) ( ) libxcb-keysyms.so.1()(64bit) ( ) xcb-util-keysyms(x86-64) ( =  0.4.1-7.el10)"
RPROVIDES:xcb-util-keysyms-devel = "pkgconfig(xcb-keysyms) ( =  0.4.1) xcb-util-keysyms-devel ( =  0.4.1-7.el10) xcb-util-keysyms-devel(x86-64) ( =  0.4.1-7.el10)"
