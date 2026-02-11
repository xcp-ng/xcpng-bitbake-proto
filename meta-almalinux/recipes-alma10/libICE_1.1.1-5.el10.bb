
PN = "libICE"
PE = "0"
PV = "1.1.1"
PR = "5.el10"
PACKAGES = "libICE libICE-devel"


URI_libICE = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libICE-1.1.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libICE = "
 glibc
"

URI_libICE-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libICE-devel-1.1.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libICE-devel = "
 xorg-x11-proto-devel
 libICE
 pkgconf-pkg-config
"
