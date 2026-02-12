
inherit dnf-bridge

PN = "wireless-regdb"
PE = "0"
PV = "2024.01.23"
PR = "3.el10"
PACKAGES = "wireless-regdb"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/wireless-regdb-2024.01.23-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_wireless-regdb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/wireless-regdb-2024.01.23-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_wireless-regdb}"
RDEPENDS:wireless-regdb = " \
 systemd-udev \
 systemd \
 bash \
 iw \
"
