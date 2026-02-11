
inherit dnf-bridge

PN = "hunspell-cy"
PE = "0"
PV = "0.20040425"
PR = "35.el10"
PACKAGES = "hunspell-cy"


URI_hunspell-cy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-cy-0.20040425-35.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-cy = " \
 hunspell-filesystem \
"
