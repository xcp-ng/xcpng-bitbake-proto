
inherit dnf-bridge

PN = "hunspell-csb"
PE = "0"
PV = "0.20190319"
PR = "6.el10"
PACKAGES = "hunspell-csb"


URI_hunspell-csb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-csb-0.20190319-6.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-csb = " \
 hunspell-filesystem \
"
