
inherit dnf-bridge

PN = "hunspell-ne"
PE = "0"
PV = "20080425"
PR = "34.el10"
PACKAGES = "hunspell-ne"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ne-20080425-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ne = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ne-20080425-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ne}"
RDEPENDS:hunspell-ne = " \
 hunspell-filesystem \
"
