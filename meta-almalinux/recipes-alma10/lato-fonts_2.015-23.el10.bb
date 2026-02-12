
inherit dnf-bridge

PN = "lato-fonts"
PE = "0"
PV = "2.015"
PR = "23.el10"
PACKAGES = "lato-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/lato-fonts-2.015-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lato-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lato-fonts-2.015-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_lato-fonts}"
RDEPENDS:lato-fonts = " \
 fonts-filesystem \
"
