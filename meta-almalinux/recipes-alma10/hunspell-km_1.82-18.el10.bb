
inherit dnf-bridge

PN = "hunspell-km"
PE = "0"
PV = "1.82"
PR = "18.el10"
PACKAGES = "hunspell-km"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-km-1.82-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-km = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-km-1.82-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-km}"
RDEPENDS:hunspell-km = " \
 hunspell-filesystem \
"
