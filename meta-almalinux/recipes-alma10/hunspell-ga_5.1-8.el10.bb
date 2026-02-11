
inherit dnf-bridge

PN = "hunspell-ga"
PE = "0"
PV = "5.1"
PR = "8.el10"
PACKAGES = "hunspell-ga"


URI_hunspell-ga = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ga-5.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-ga = " \
 hunspell-filesystem \
"
