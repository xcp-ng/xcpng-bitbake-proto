
inherit dnf-bridge

PN = "hunspell-ht"
PE = "0"
PV = "0.06"
PR = "30.el10"
PACKAGES = "hunspell-ht"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ht-0.06-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ht = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ht-0.06-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ht}"
RDEPENDS:hunspell-ht = " \
 hunspell-filesystem \
"
