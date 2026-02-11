
inherit dnf-bridge

PN = "hunspell-bn"
PE = "1"
PV = "1.0.0"
PR = "27.el10"
PACKAGES = "hunspell-bn"


URI_hunspell-bn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-bn-1.0.0-27.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-bn = " \
 hunspell-filesystem \
"
