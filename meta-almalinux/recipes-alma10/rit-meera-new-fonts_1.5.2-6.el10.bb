
inherit dnf-bridge

PN = "rit-meera-new-fonts"
PE = "0"
PV = "1.5.2"
PR = "6.el10"
PACKAGES = "rit-meera-new-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rit-meera-new-fonts-1.5.2-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rit-meera-new-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rit-meera-new-fonts-1.5.2-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rit-meera-new-fonts}"
RDEPENDS:rit-meera-new-fonts = " \
 fonts-filesystem \
"
