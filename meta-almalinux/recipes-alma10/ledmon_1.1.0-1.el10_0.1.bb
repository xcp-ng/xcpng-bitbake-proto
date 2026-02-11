
PN = "ledmon"
PE = "0"
PV = "1.1.0"
PR = "1.el10_0.1"
PACKAGES = "ledmon ledmon-libs ledmon-devel"


URI_ledmon = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ledmon-1.1.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ledmon = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libpci.so.3()(64bit) ( ) libpci.so.3(LIBPCI_3.0)(64bit) ( ) libpci.so.3(LIBPCI_3.5)(64bit) ( ) libpci.so.3(LIBPCI_3.1)(64bit) ( ) libsgutils2-1.48.so.2()(64bit) ( )"
RPROVIDES:ledmon = "ledctl ( =  1.1.0-1.el10_0.1) ledmon ( =  1.1.0-1.el10_0.1) ledmon(x86-64) ( =  1.1.0-1.el10_0.1)"

URI_ledmon-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ledmon-libs-1.1.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ledmon-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) pciutils-libs ( ) libpci.so.3()(64bit) ( ) libpci.so.3(LIBPCI_3.0)(64bit) ( ) libpci.so.3(LIBPCI_3.5)(64bit) ( ) libsgutils2-1.48.so.2()(64bit) ( ) libpci.so.3(LIBPCI_3.1)(64bit) ( ) sg3_utils-libs ( )"
RPROVIDES:ledmon-libs = "libled.so.1()(64bit) ( ) ledmon-libs ( =  1.1.0-1.el10_0.1) ledmon-libs(x86-64) ( =  1.1.0-1.el10_0.1)"

URI_ledmon-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ledmon-devel-1.1.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ledmon-devel = "/usr/bin/pkg-config ( ) sg3_utils-devel ( ) libled.so.1()(64bit) ( ) pciutils-devel ( ) ledmon-libs(x86-64) ( =  1.1.0-1.el10_0.1)"
RPROVIDES:ledmon-devel = "pkgconfig(ledmon) ( =  1.1.0) ledmon-devel ( =  1.1.0-1.el10_0.1) ledmon-devel(x86-64) ( =  1.1.0-1.el10_0.1)"
