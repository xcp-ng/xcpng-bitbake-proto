
inherit dnf-bridge

PN = "grubby"
PE = "0"
PV = "8.40"
PR = "77.el10"
PACKAGES = "grubby"


URI_grubby = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grubby-8.40-77.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:grubby = " \
 grub2-tools-minimal \
 util-linux \
 bash \
 findutils \
 grub2-tools \
"
