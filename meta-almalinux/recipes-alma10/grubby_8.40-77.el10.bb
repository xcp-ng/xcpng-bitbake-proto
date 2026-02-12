
inherit dnf-bridge

PN = "grubby"
PE = "0"
PV = "8.40"
PR = "77.el10"
PACKAGES = "grubby"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/grubby-8.40-77.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_grubby = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grubby-8.40-77.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_grubby}"
RDEPENDS:grubby = " \
 grub2-tools-minimal \
 util-linux \
 bash \
 findutils \
 grub2-tools \
"
