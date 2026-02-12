
inherit dnf-bridge

PN = "hunspell-af"
PE = "0"
PV = "0.20080825"
PR = "33.el10"
PACKAGES = "hunspell-af"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-af-0.20080825-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-af = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-af-0.20080825-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-af}"
RDEPENDS:hunspell-af = " \
 hunspell-filesystem \
"
