
PN = "parted"
PE = "0"
PV = "3.6"
PR = "7.el10"
PACKAGES = "parted parted-devel"


URI_parted = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/parted-3.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:parted = "
 libuuid
 device-mapper-libs
 libblkid
 readline
 ncurses-libs
 glibc
"

URI_parted-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/parted-devel-3.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:parted-devel = "
 parted
 pkgconf-pkg-config
"
