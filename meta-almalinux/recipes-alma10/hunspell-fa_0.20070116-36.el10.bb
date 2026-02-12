
inherit dnf-bridge

PN = "hunspell-fa"
PE = "0"
PV = "0.20070116"
PR = "36.el10"
PACKAGES = "hunspell-fa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-fa-0.20070116-36.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-fa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-fa-0.20070116-36.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-fa}"
RDEPENDS:hunspell-fa = " \
 hunspell-filesystem \
"
