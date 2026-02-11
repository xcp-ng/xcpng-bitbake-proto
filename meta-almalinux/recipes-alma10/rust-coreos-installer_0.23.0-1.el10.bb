
PN = "rust-coreos-installer"
PE = "0"
PV = "0.23.0"
PR = "1.el10"
PACKAGES = "coreos-installer coreos-installer-bootinfra coreos-installer-dracut"


URI_coreos-installer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/coreos-installer-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreos-installer = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libzstd.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) util-linux ( ) libc.so.6(GLIBC_2.39)(64bit) ( ) systemd-udev ( ) gnupg ( ) kpartx ( )"
RPROVIDES:coreos-installer = "coreos-installer ( =  0.23.0-1.el10) coreos-installer(x86-64) ( =  0.23.0-1.el10)"

URI_coreos-installer-bootinfra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/coreos-installer-bootinfra-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreos-installer-bootinfra = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libssl.so.3()(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libzstd.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) libc.so.6(GLIBC_2.39)(64bit) ( ) coreos-installer(x86-64) ( =  0.23.0-1.el10)"
RPROVIDES:coreos-installer-bootinfra = "coreos-installer-bootinfra ( =  0.23.0-1.el10) coreos-installer-bootinfra(x86-64) ( =  0.23.0-1.el10) coreos-installer-systemd ( =  0.23.0-1.el10)"

URI_coreos-installer-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/coreos-installer-dracut-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreos-installer-dracut = "/usr/bin/bash ( ) coreos-installer ( =  0.23.0-1.el10)"
RPROVIDES:coreos-installer-dracut = "coreos-installer-dracut ( =  0.23.0-1.el10) coreos-installer-dracut(x86-64) ( =  0.23.0-1.el10)"
