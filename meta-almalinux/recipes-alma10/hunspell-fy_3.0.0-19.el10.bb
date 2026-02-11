
inherit dnf-bridge

PN = "hunspell-fy"
PE = "0"
PV = "3.0.0"
PR = "19.el10"
PACKAGES = "hunspell-fy"


URI_hunspell-fy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-fy-3.0.0-19.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-fy = " \
 hunspell-filesystem \
"
