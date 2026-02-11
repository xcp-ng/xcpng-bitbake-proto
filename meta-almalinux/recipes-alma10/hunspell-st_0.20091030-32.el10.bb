
inherit dnf-bridge

PN = "hunspell-st"
PE = "0"
PV = "0.20091030"
PR = "32.el10"
PACKAGES = "hunspell-st"


URI_hunspell-st = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-st-0.20091030-32.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-st = " \
 hunspell \
"
