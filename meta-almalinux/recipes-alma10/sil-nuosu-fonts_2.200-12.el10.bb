
inherit dnf-bridge

PN = "sil-nuosu-fonts"
PE = "0"
PV = "2.200"
PR = "12.el10"
PACKAGES = "sil-nuosu-fonts"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/sil-nuosu-fonts-2.200-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sil-nuosu-fonts = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sil-nuosu-fonts-2.200-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_sil-nuosu-fonts}"
RDEPENDS:sil-nuosu-fonts = " \
 fonts-filesystem \
"
