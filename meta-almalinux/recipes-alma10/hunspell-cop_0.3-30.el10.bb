
inherit dnf-bridge

PN = "hunspell-cop"
PE = "0"
PV = "0.3"
PR = "30.el10"
PACKAGES = "hunspell-cop"


URI_hunspell-cop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-cop-0.3-30.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-cop = " \
 hunspell-filesystem \
"
