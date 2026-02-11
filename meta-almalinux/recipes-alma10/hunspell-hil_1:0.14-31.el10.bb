
inherit dnf-bridge

PN = "hunspell-hil"
PE = "1"
PV = "0.14"
PR = "31.el10"
PACKAGES = "hunspell-hil"


URI_hunspell-hil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-hil-0.14-31.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-hil = " \
 hunspell-filesystem \
"
