
PN = "system-config-printer"
PE = "0"
PV = "1.5.18"
PR = "11.el10"
PACKAGES = "system-config-printer-libs system-config-printer-udev"


URI_system-config-printer-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/system-config-printer-libs-1.5.18-11.el10.noarch.rpm;unpack=0"
RDEPENDS:system-config-printer-libs = "/usr/bin/sh ( ) /usr/bin/python3 ( ) python3-gobject ( ) gtk3 ( ) python3-dbus ( ) libnotify ( ) gobject-introspection ( ) python(abi) ( =  3.12) python3-cups ( >=  1.9.60)"
RPROVIDES:system-config-printer-libs = "system-config-printer-libs ( =  1.5.18-11.el10) config(system-config-printer-libs) ( =  1.5.18-11.el10) python3.12dist(cupshelpers) ( =  1) python3dist(cupshelpers) ( =  1)"

URI_system-config-printer-udev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/system-config-printer-udev-1.5.18-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:system-config-printer-udev = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libcups.so.2()(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) system-config-printer-libs ( =  1.5.18-11.el10)"
RPROVIDES:system-config-printer-udev = "config(system-config-printer-udev) ( =  1.5.18-11.el10) system-config-printer-udev ( =  1.5.18-11.el10) system-config-printer-udev(x86-64) ( =  1.5.18-11.el10)"
