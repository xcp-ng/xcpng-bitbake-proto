
inherit dnf-bridge

PN = "virt-p2v"
PE = "1"
PV = "1.42.4"
PR = "1.el10"
PACKAGES = "virt-p2v"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/virt-p2v-1.42.4-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_virt-p2v = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-p2v-1.42.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_virt-p2v}"
RDEPENDS:virt-p2v = " \
 gzip \
 gawk \
 bash \
 binutils \
 guestfs-tools \
"
