
inherit dnf-bridge

PN = "ucs-miscfixed-fonts"
PE = "0"
PV = "0.3"
PR = "34.el10"
PACKAGES = "ucs-miscfixed-fonts ucs-miscfixed-opentype-fonts"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/ucs-miscfixed-fonts-0.3-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ucs-miscfixed-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucs-miscfixed-fonts-0.3-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ucs-miscfixed-fonts}"
RDEPENDS:ucs-miscfixed-fonts = ""

URI_ucs-miscfixed-opentype-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucs-miscfixed-opentype-fonts-0.3-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ucs-miscfixed-opentype-fonts}"
RDEPENDS:ucs-miscfixed-opentype-fonts = ""
