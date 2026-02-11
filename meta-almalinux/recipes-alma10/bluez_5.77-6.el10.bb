
PN = "bluez"
PE = "0"
PV = "5.77"
PR = "6.el10"
PACKAGES = "bluez bluez-libs bluez-cups bluez-obexd bluez-libs-devel bluez-hid2hci bluez-mesh"


URI_bluez = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bluez-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libreadline.so.8()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libudev.so.1(LIBUDEV_196)(64bit) ( ) dbus ( >=  1.6)"
RPROVIDES:bluez = "bluez ( =  5.77-6.el10) bluez(x86-64) ( =  5.77-6.el10) config(bluez) ( =  5.77-6.el10)"

URI_bluez-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bluez-libs-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:bluez-libs = "libbluetooth.so.3()(64bit) ( ) bluez-libs ( =  5.77-6.el10) bluez-libs(x86-64) ( =  5.77-6.el10)"

URI_bluez-cups = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bluez-cups-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-cups = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) cups ( ) bluez(x86-64) ( =  5.77-6.el10)"
RPROVIDES:bluez-cups = "bluez-cups ( =  5.77-6.el10) bluez-cups(x86-64) ( =  5.77-6.el10)"

URI_bluez-obexd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bluez-obexd-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-obexd = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libicalvcal.so.3()(64bit) ( ) bluez(x86-64) ( =  5.77-6.el10) bluez-libs(x86-64) ( =  5.77-6.el10)"
RPROVIDES:bluez-obexd = "bluez-obexd ( =  5.77-6.el10) bluez-obexd(x86-64) ( =  5.77-6.el10)"

URI_bluez-libs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bluez-libs-devel-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-libs-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libbluetooth.so.3()(64bit) ( ) bluez-libs(x86-64) ( =  5.77-6.el10)"
RPROVIDES:bluez-libs-devel = "bluez-libs-devel ( =  5.77-6.el10) bluez-libs-devel(x86-64) ( =  5.77-6.el10) pkgconfig(bluez) ( =  5.77)"

URI_bluez-hid2hci = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bluez-hid2hci-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-hid2hci = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) bluez(x86-64) ( =  5.77-6.el10)"
RPROVIDES:bluez-hid2hci = "bluez-hid2hci ( =  5.77-6.el10) bluez-hid2hci(x86-64) ( =  5.77-6.el10)"

URI_bluez-mesh = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bluez-mesh-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-mesh = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libreadline.so.8()(64bit) ( ) libell.so.0()(64bit) ( ) libell.so.0(ELL_0.10)(64bit) ( ) bluez(x86-64) ( =  5.77-6.el10) bluez-libs(x86-64) ( =  5.77-6.el10)"
RPROVIDES:bluez-mesh = "bluez-mesh ( =  5.77-6.el10) bluez-mesh(x86-64) ( =  5.77-6.el10) config(bluez-mesh) ( =  5.77-6.el10)"
