
inherit dnf-bridge

PN = "hunspell-zu"
PE = "0"
PV = "0.20100126"
PR = "33.el10"
PACKAGES = "hunspell-zu"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-zu-0.20100126-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-zu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-zu-0.20100126-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-zu}"
RDEPENDS:hunspell-zu = " \
 hunspell-filesystem \
"
