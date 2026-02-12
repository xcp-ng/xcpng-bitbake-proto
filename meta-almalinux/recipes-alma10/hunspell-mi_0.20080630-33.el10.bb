
inherit dnf-bridge

PN = "hunspell-mi"
PE = "0"
PV = "0.20080630"
PR = "33.el10"
PACKAGES = "hunspell-mi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-mi-0.20080630-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-mi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-mi-0.20080630-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-mi}"
RDEPENDS:hunspell-mi = " \
 hunspell-filesystem \
"
