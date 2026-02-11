
PN = "rust-coreos-installer"
PE = "0"
PV = "0.23.0"
PR = "1.el10"
PACKAGES = "coreos-installer coreos-installer-bootinfra coreos-installer-dracut"


URI_coreos-installer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/coreos-installer-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreos-installer = "
 gnupg2
 util-linux
 systemd-udev
 openssl-libs
 libgcc
 kpartx
 libzstd
 glibc
 xz-libs
"

URI_coreos-installer-bootinfra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/coreos-installer-bootinfra-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreos-installer-bootinfra = "
 coreos-installer
 openssl-libs
 libgcc
 libzstd
 bash
 glibc
 xz-libs
"

URI_coreos-installer-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/coreos-installer-dracut-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreos-installer-dracut = "
 coreos-installer
 bash
"
