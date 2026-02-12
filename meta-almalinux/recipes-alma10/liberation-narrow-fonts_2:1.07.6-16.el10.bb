
inherit dnf-bridge

PN = "liberation-narrow-fonts"
PE = "2"
PV = "1.07.6"
PR = "16.el10"
PACKAGES = "liberation-narrow-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/liberation-narrow-fonts-1.07.6-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_liberation-narrow-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liberation-narrow-fonts-1.07.6-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_liberation-narrow-fonts}"
RDEPENDS:liberation-narrow-fonts = " \
 fonts-filesystem \
"
