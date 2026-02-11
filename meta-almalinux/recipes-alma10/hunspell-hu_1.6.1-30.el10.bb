
inherit dnf-bridge

PN = "hunspell-hu"
PE = "0"
PV = "1.6.1"
PR = "30.el10"
PACKAGES = "hunspell-hu"


URI_hunspell-hu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-hu-1.6.1-30.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-hu = " \
 hunspell-filesystem \
"
