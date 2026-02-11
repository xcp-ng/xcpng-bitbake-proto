
inherit dnf-bridge

PN = "hunspell-yi"
PE = "0"
PV = "1.1"
PR = "32.el10"
PACKAGES = "hunspell-yi"


URI_hunspell-yi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-yi-1.1-32.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-yi = " \
 hunspell-filesystem \
"
