
inherit dnf-bridge

PN = "hunspell-ts"
PE = "0"
PV = "0.20110323.1"
PR = "18.el10"
PACKAGES = "hunspell-ts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ts-0.20110323.1-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ts-0.20110323.1-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ts}"
RDEPENDS:hunspell-ts = " \
 hunspell-filesystem \
"
