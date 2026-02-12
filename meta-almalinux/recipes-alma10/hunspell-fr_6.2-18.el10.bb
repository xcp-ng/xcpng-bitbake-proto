
inherit dnf-bridge

PN = "hunspell-fr"
PE = "0"
PV = "6.2"
PR = "18.el10"
PACKAGES = "hunspell-fr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-fr-6.2-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-fr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-fr-6.2-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-fr}"
RDEPENDS:hunspell-fr = " \
 hunspell-filesystem \
"
