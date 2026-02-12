
inherit dnf-bridge

PN = "paktype-naskh-basic-fonts"
PE = "0"
PV = "6.0"
PR = "14.el10"
PACKAGES = "paktype-naskh-basic-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/paktype-naskh-basic-fonts-6.0-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_paktype-naskh-basic-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/paktype-naskh-basic-fonts-6.0-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_paktype-naskh-basic-fonts}"
RDEPENDS:paktype-naskh-basic-fonts = " \
 fonts-filesystem \
"
