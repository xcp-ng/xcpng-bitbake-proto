
inherit dnf-bridge

PN = "basesystem"
PE = "0"
PV = "11"
PR = "22.el10"
PACKAGES = "basesystem"


URI_basesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/basesystem-11-22.el10.noarch.rpm;unpack=0"
RDEPENDS:basesystem = " \
 setup \
 filesystem \
"
