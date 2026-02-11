
inherit dnf-bridge

PN = "hunspell-ta"
PE = "1"
PV = "1.0.0"
PR = "26.el10"
PACKAGES = "hunspell-ta"


URI_hunspell-ta = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ta-1.0.0-26.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-ta = " \
 hunspell-filesystem \
"
