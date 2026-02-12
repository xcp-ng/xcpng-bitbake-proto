
inherit dnf-bridge

PN = "hunspell-id"
PE = "0"
PV = "0.20040812"
PR = "33.el10"
PACKAGES = "hunspell-id"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-id-0.20040812-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-id = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-id-0.20040812-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-id}"
RDEPENDS:hunspell-id = " \
 hunspell-filesystem \
"
