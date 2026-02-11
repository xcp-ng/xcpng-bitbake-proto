
PN = "rust-bootupd"
PE = "0"
PV = "0.2.27"
PR = "2.el10"
PACKAGES = "bootupd"


URI_bootupd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bootupd-0.2.27-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bootupd = "
 glibc
 libgcc
 systemd
 openssl-libs
"
