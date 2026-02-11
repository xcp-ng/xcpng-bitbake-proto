
inherit dnf-bridge

PN = "hunspell-om"
PE = "1"
PV = "0.04"
PR = "33.el10"
PACKAGES = "hunspell-om"


URI_hunspell-om = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-om-0.04-33.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-om = " \
 hunspell \
"
