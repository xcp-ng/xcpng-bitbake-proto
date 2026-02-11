
PN = "bolt"
PE = "0"
PV = "0.9.8"
PR = "3.el10"
PACKAGES = "bolt"


URI_bolt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bolt-0.9.8-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bolt = "
 systemd
 systemd-libs
 libgcc
 polkit-libs
 bash
 glib2
 glibc
"
