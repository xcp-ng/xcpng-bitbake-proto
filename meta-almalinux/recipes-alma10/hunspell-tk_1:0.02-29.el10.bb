
inherit dnf-bridge

PN = "hunspell-tk"
PE = "1"
PV = "0.02"
PR = "29.el10"
PACKAGES = "hunspell-tk"


URI_hunspell-tk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-tk-0.02-29.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-tk = " \
 hunspell-filesystem \
"
