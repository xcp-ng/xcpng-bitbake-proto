
PN = "rust-afterburn"
PE = "0"
PV = "5.7.0"
PR = "1.el10"
PACKAGES = "afterburn afterburn-dracut"


URI_afterburn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/afterburn-5.7.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:afterburn = "
 systemd
 libgcc
 openssl-libs
 bash
 glibc
"

URI_afterburn-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/afterburn-dracut-5.7.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:afterburn-dracut = "
 dracut-network
 bash
 dracut
 afterburn
"
