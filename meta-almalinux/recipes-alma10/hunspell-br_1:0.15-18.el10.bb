
inherit dnf-bridge

PN = "hunspell-br"
PE = "1"
PV = "0.15"
PR = "18.el10"
PACKAGES = "hunspell-br"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-br-0.15-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-br = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-br-0.15-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-br}"
RDEPENDS:hunspell-br = " \
 hunspell-filesystem \
"
