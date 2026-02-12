
inherit dnf-bridge

PN = "efibootmgr"
PE = "0"
PV = "18"
PR = "8.el10"
PACKAGES = "efibootmgr"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/efibootmgr-18-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_efibootmgr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/efibootmgr-18-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_efibootmgr}"
RDEPENDS:efibootmgr = " \
 glibc \
 efi-filesystem \
 popt \
 efivar-libs \
"
