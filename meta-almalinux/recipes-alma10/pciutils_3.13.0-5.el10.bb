
PN = "pciutils"
PE = "0"
PV = "3.13.0"
PR = "5.el10"
PACKAGES = "pciutils pciutils-libs pciutils-devel pciutils-devel-static"


URI_pciutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pciutils-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpci.so.3()(64bit) ( ) libpci.so.3(LIBPCI_3.0)(64bit) ( ) libpci.so.3(LIBPCI_3.5)(64bit) ( ) libpci.so.3(LIBPCI_3.8)(64bit) ( ) libkmod.so.2()(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( ) hwdata ( ) libpci.so.3(LIBPCI_3.1)(64bit) ( ) libpci.so.3(LIBPCI_3.13)(64bit) ( ) libpci.so.3(LIBPCI_3.6)(64bit) ( ) libpci.so.3(LIBPCI_3.7)(64bit) ( ) pciutils-libs ( =  3.13.0-5.el10)"
RPROVIDES:pciutils = "/bin/lspci ( ) /sbin/lspci ( ) /sbin/setpci ( ) pciutils ( =  3.13.0-5.el10) pciutils(x86-64) ( =  3.13.0-5.el10)"

URI_pciutils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pciutils-libs-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:pciutils-libs = "libpci.so.3()(64bit) ( ) libpci.so.3(LIBPCI_3.0)(64bit) ( ) libpci.so.3(LIBPCI_3.5)(64bit) ( ) libpci.so.3(LIBPCI_3.8)(64bit) ( ) libpci.so.3(LIBPCI_3.1)(64bit) ( ) libpci.so.3(LIBPCI_3.13)(64bit) ( ) libpci.so.3(LIBPCI_3.6)(64bit) ( ) libpci.so.3(LIBPCI_3.7)(64bit) ( ) libpci.so.3(LIBPCI_3.2)(64bit) ( ) libpci.so.3(LIBPCI_3.3)(64bit) ( ) libpci.so.3(LIBPCI_3.4)(64bit) ( ) pciutils-libs ( =  3.13.0-5.el10) pciutils-libs(x86-64) ( =  3.13.0-5.el10)"

URI_pciutils-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pciutils-devel-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) zlib-devel ( ) libpci.so.3()(64bit) ( ) pciutils(x86-64) ( =  3.13.0-5.el10)"
RPROVIDES:pciutils-devel = "pciutils-devel ( =  3.13.0-5.el10) pciutils-devel(x86-64) ( =  3.13.0-5.el10) pkgconfig(libpci) ( =  3.13.0)"

URI_pciutils-devel-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pciutils-devel-static-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils-devel-static = "pciutils-devel(x86-64) ( =  3.13.0-5.el10)"
RPROVIDES:pciutils-devel-static = "pciutils-devel-static ( =  3.13.0-5.el10) pciutils-devel-static(x86-64) ( =  3.13.0-5.el10)"
