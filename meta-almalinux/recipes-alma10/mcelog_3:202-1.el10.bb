
inherit dnf-bridge

PN = "mcelog"
PE = "3"
PV = "202"
PR = "1.el10"
PACKAGES = "mcelog"


URI_mcelog = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mcelog-202-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mcelog = " \
 glibc \
 systemd \
 bash \
"
