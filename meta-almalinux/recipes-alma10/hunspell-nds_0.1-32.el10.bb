
inherit dnf-bridge

PN = "hunspell-nds"
PE = "0"
PV = "0.1"
PR = "32.el10"
PACKAGES = "hunspell-nds"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-nds-0.1-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-nds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-nds-0.1-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-nds}"
RDEPENDS:hunspell-nds = " \
 hunspell-filesystem \
"
