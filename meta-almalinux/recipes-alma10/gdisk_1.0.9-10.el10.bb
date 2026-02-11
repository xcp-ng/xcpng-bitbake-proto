
PN = "gdisk"
PE = "0"
PV = "1.0.9"
PR = "10.el10"
PACKAGES = "gdisk"


URI_gdisk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gdisk-1.0.9-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gdisk = "
 libuuid
 libgcc
 libstdc++
 ncurses-libs
 popt
 glibc
"
