
PN = "libevdev"
PE = "0"
PV = "1.13.1"
PR = "6.el10"
PACKAGES = "libevdev libevdev-devel libevdev-utils"


URI_libevdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevdev-1.13.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevdev = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libevdev = "libevdev.so.2()(64bit) ( ) libevdev.so.2(LIBEVDEV_1)(64bit) ( ) libevdev.so.2(LIBEVDEV_1_3)(64bit) ( ) libevdev.so.2(LIBEVDEV_1_10)(64bit) ( ) libevdev.so.2(LIBEVDEV_1_7)(64bit) ( ) libevdev.so.2(LIBEVDEV_1_6)(64bit) ( ) libevdev(x86-64) ( =  1.13.1-6.el10) libevdev ( =  1.13.1-6.el10)"

URI_libevdev-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevdev-devel-1.13.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevdev-devel = "/usr/bin/pkg-config ( ) libevdev.so.2()(64bit) ( ) libevdev(x86-64) ( =  1.13.1-6.el10)"
RPROVIDES:libevdev-devel = "libevdev-devel ( =  1.13.1-6.el10) libevdev-devel(x86-64) ( =  1.13.1-6.el10) pkgconfig(libevdev) ( =  1.13.1)"

URI_libevdev-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libevdev-utils-1.13.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevdev-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libevdev.so.2()(64bit) ( ) libevdev.so.2(LIBEVDEV_1)(64bit) ( ) libevdev(x86-64) ( =  1.13.1-6.el10)"
RPROVIDES:libevdev-utils = "libevdev-utils ( =  1.13.1-6.el10) libevdev-utils(x86-64) ( =  1.13.1-6.el10)"
