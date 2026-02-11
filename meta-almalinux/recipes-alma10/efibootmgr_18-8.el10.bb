
PN = "efibootmgr"
PE = "0"
PV = "18"
PR = "8.el10"
PACKAGES = "efibootmgr"


URI_efibootmgr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/efibootmgr-18-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efibootmgr = " \
 glibc \
 efi-filesystem \
 popt \
 efivar-libs \
"
