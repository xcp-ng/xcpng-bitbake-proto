
inherit dnf-bridge

PN = "hunspell-ky"
PE = "0"
PV = "0.20090415"
PR = "34.el10"
PACKAGES = "hunspell-ky"


URI_hunspell-ky = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ky-0.20090415-34.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-ky = " \
 hunspell-filesystem \
"
