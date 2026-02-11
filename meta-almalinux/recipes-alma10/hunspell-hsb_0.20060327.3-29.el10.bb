
inherit dnf-bridge

PN = "hunspell-hsb"
PE = "0"
PV = "0.20060327.3"
PR = "29.el10"
PACKAGES = "hunspell-hsb"


URI_hunspell-hsb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-hsb-0.20060327.3-29.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-hsb = " \
 hunspell-filesystem \
"
