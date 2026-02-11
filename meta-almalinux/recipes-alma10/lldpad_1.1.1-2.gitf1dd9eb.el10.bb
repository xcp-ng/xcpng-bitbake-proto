
PN = "lldpad"
PE = "0"
PV = "1.1.1"
PR = "2.gitf1dd9eb.el10"
PACKAGES = "lldpad lldpad-devel"


URI_lldpad = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lldpad-1.1.1-2.gitf1dd9eb.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpad = "
 systemd
 libnl3
 readline
 bash
 libconfig
 glibc
"

URI_lldpad-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lldpad-devel-1.1.1-2.gitf1dd9eb.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpad-devel = "
 lldpad
 pkgconf-pkg-config
"
