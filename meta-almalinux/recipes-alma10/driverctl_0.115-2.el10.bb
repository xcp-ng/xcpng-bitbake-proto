
PN = "driverctl"
PE = "0"
PV = "0.115"
PR = "2.el10"
PACKAGES = "driverctl"


URI_driverctl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/driverctl-0.115-2.el10.noarch.rpm;unpack=0"
RDEPENDS:driverctl = "
 coreutils
 systemd-udev
 bash
"
