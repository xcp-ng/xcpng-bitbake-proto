
PN = "umockdev"
PE = "0"
PV = "0.18.3"
PR = "2.el10"
PACKAGES = "umockdev umockdev-devel"


URI_umockdev = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/umockdev-0.18.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:umockdev = "rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libselinux.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpcap.so.1()(64bit) ( )"
RPROVIDES:umockdev = "libumockdev.so.0()(64bit) ( ) libumockdev-preload.so.0()(64bit) ( ) umockdev(x86-64) ( =  0.18.3-2.el10) umockdev ( =  0.18.3-2.el10)"

URI_umockdev-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/umockdev-devel-0.18.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:umockdev-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) libumockdev.so.0()(64bit) ( ) umockdev(x86-64) ( =  0.18.3-2.el10)"
RPROVIDES:umockdev-devel = "pkgconfig(umockdev-1.0) ( =  0.18.3) umockdev-devel ( =  0.18.3-2.el10) umockdev-devel(x86-64) ( =  0.18.3-2.el10)"
