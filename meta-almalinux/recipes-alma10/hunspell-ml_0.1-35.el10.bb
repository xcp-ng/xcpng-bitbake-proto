
inherit dnf-bridge

PN = "hunspell-ml"
PE = "0"
PV = "0.1"
PR = "35.el10"
PACKAGES = "hunspell-ml"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ml-0.1-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ml-0.1-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ml}"
RDEPENDS:hunspell-ml = " \
 hunspell-filesystem \
"
