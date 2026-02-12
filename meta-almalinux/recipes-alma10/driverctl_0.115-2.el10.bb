
inherit dnf-bridge

PN = "driverctl"
PE = "0"
PV = "0.115"
PR = "2.el10"
PACKAGES = "driverctl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/driverctl-0.115-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_driverctl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/driverctl-0.115-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_driverctl}"
RDEPENDS:driverctl = " \
 coreutils \
 systemd-udev \
 bash \
"
