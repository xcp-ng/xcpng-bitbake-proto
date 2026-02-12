
inherit dnf-bridge

PN = "mcelog"
PE = "3"
PV = "202"
PR = "1.el10"
PACKAGES = "mcelog"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/mcelog-202-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mcelog = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mcelog-202-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mcelog}"
RDEPENDS:mcelog = " \
 glibc \
 systemd \
 bash \
"
