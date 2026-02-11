
PN = "flashrom"
PE = "0"
PV = "1.3.0"
PR = "8.el10"
PACKAGES = "flashrom flashrom-devel"


URI_flashrom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flashrom-1.3.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flashrom = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) udev ( ) libpci.so.3()(64bit) ( ) libpci.so.3(LIBPCI_3.0)(64bit) ( ) libpci.so.3(LIBPCI_3.5)(64bit) ( ) dmidecode ( ) libpci.so.3(LIBPCI_3.13)(64bit) ( ) libpci.so.3(LIBPCI_3.8)(64bit) ( )"
RPROVIDES:flashrom = "libflashrom.so.1()(64bit) ( ) libflashrom.so.1(LIBFLASHROM_1.0)(64bit) ( ) flashrom ( =  1.3.0-8.el10) flashrom(x86-64) ( =  1.3.0-8.el10)"

URI_flashrom-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flashrom-devel-1.3.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flashrom-devel = "/usr/bin/pkg-config ( ) pkgconfig(libusb-1.0) ( ) libflashrom.so.1()(64bit) ( ) pkgconfig(libpci) ( ) flashrom(x86-64) ( =  1.3.0-8.el10)"
RPROVIDES:flashrom-devel = "flashrom-devel ( =  1.3.0-8.el10) flashrom-devel(x86-64) ( =  1.3.0-8.el10) pkgconfig(flashrom) ( =  1.3.0)"
