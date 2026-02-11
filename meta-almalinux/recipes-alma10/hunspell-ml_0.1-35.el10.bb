
inherit dnf-bridge

PN = "hunspell-ml"
PE = "0"
PV = "0.1"
PR = "35.el10"
PACKAGES = "hunspell-ml"


URI_hunspell-ml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ml-0.1-35.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-ml = " \
 hunspell-filesystem \
"
