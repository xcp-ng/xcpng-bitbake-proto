
PN = "libwacom"
PE = "0"
PV = "2.14.0"
PR = "3.el10_0"
PACKAGES = "libwacom libwacom-data libwacom-devel libwacom-utils"


URI_libwacom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwacom-2.14.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwacom = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgudev-1.0.so.0()(64bit) ( ) libevdev.so.2()(64bit) ( ) libevdev.so.2(LIBEVDEV_1)(64bit) ( ) libwacom-data ( ) libevdev.so.2(LIBEVDEV_1_7)(64bit) ( ) libwacom-data ( =  2.14.0-3.el10_0)"
RPROVIDES:libwacom = "libwacom.so.9()(64bit) ( ) libwacom.so.9(LIBWACOM_2.0)(64bit) ( ) libwacom.so.9(LIBWACOM_2.12)(64bit) ( ) libwacom.so.9(LIBWACOM_2.14)(64bit) ( ) libwacom.so.9(LIBWACOM_2.9)(64bit) ( ) libwacom ( =  2.14.0-3.el10_0) libwacom(x86-64) ( =  2.14.0-3.el10_0)"

URI_libwacom-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwacom-data-2.14.0-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:libwacom-data = ""
RPROVIDES:libwacom-data = "libwacom-data ( =  2.14.0-3.el10_0)"

URI_libwacom-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwacom-devel-2.14.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwacom-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(glib-2.0) ( ) libwacom.so.9()(64bit) ( ) pkgconfig(gudev-1.0) ( ) pkgconfig(libevdev) ( ) libwacom ( =  2.14.0-3.el10_0)"
RPROVIDES:libwacom-devel = "pkgconfig(libwacom) ( =  2.14.0) libwacom-devel ( =  2.14.0-3.el10_0) libwacom-devel(x86-64) ( =  2.14.0-3.el10_0)"

URI_libwacom-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libwacom-utils-2.14.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwacom-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libwacom.so.9()(64bit) ( ) libwacom.so.9(LIBWACOM_2.0)(64bit) ( ) libwacom.so.9(LIBWACOM_2.12)(64bit) ( ) python3-libevdev ( ) python3-pyudev ( ) libwacom ( =  2.14.0-3.el10_0)"
RPROVIDES:libwacom-utils = "libwacom-utils ( =  2.14.0-3.el10_0) libwacom-utils(x86-64) ( =  2.14.0-3.el10_0)"
