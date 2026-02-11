
inherit dnf-bridge

PN = "hunspell-ko"
PE = "0"
PV = "0.7.0"
PR = "21.el10"
PACKAGES = "hunspell-ko"


URI_hunspell-ko = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ko-0.7.0-21.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-ko = " \
 hunspell-filesystem \
"
