
PN = "powertop"
PE = "0"
PV = "2.15"
PR = "8.el10"
PACKAGES = "powertop"


URI_powertop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/powertop-2.15-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:powertop = "
 systemd
 libgcc
 libnl3
 libstdc++
 bash
 ncurses-libs
 pciutils-libs
 glibc
 coreutils
"
