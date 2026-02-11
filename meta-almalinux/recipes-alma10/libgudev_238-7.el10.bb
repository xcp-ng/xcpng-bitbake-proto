
PN = "libgudev"
PE = "0"
PV = "238"
PR = "7.el10"
PACKAGES = "libgudev libgudev-devel"


URI_libgudev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgudev-238-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgudev = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libudev.so.1(LIBUDEV_199)(64bit) ( ) libudev.so.1(LIBUDEV_247)(64bit) ( )"
RPROVIDES:libgudev = "libgudev-1.0.so.0()(64bit) ( ) libgudev ( =  238-7.el10) libgudev(x86-64) ( =  238-7.el10) libgudev1 ( =  238-7.el10)"

URI_libgudev-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgudev-devel-238-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgudev-devel = "/usr/bin/pkg-config ( ) libgudev-1.0.so.0()(64bit) ( ) libgudev(x86-64) ( =  238-7.el10) pkgconfig(glib-2.0) ( >=  2.38.0) pkgconfig(gobject-2.0) ( >=  2.38.0) pkgconfig(libudev) ( >=  251)"
RPROVIDES:libgudev-devel = "libgudev-devel ( =  238-7.el10) libgudev-devel(x86-64) ( =  238-7.el10) libgudev1-devel ( =  238-7.el10) pkgconfig(gudev-1.0) ( =  238)"
