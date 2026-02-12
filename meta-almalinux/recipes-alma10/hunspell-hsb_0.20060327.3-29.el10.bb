
inherit dnf-bridge

PN = "hunspell-hsb"
PE = "0"
PV = "0.20060327.3"
PR = "29.el10"
PACKAGES = "hunspell-hsb"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-hsb-0.20060327.3-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-hsb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-hsb-0.20060327.3-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-hsb}"
RDEPENDS:hunspell-hsb = " \
 hunspell-filesystem \
"
