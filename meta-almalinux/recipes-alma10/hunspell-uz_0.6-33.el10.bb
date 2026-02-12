
inherit dnf-bridge

PN = "hunspell-uz"
PE = "0"
PV = "0.6"
PR = "33.el10"
PACKAGES = "hunspell-uz"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-uz-0.6-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-uz = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-uz-0.6-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-uz}"
RDEPENDS:hunspell-uz = " \
 hunspell-filesystem \
"
