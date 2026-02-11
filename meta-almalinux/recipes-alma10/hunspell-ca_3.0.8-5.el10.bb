
inherit dnf-bridge

PN = "hunspell-ca"
PE = "0"
PV = "3.0.8"
PR = "5.el10"
PACKAGES = "hunspell-ca"


URI_hunspell-ca = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ca-3.0.8-5.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-ca = " \
 hunspell-filesystem \
"
