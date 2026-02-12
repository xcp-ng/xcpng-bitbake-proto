
inherit dnf-bridge

PN = "google-carlito-fonts"
PE = "0"
PV = "1.103"
PR = "0.26.20130920.el10"
PACKAGES = "google-carlito-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/google-carlito-fonts-1.103-0.26.20130920.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_google-carlito-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-carlito-fonts-1.103-0.26.20130920.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_google-carlito-fonts}"
RDEPENDS:google-carlito-fonts = " \
 fonts-filesystem \
"
