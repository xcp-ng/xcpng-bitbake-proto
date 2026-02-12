
inherit dnf-bridge

PN = "hunspell-mos"
PE = "0"
PV = "0.20101130"
PR = "30.el10"
PACKAGES = "hunspell-mos"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-mos-0.20101130-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-mos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-mos-0.20101130-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-mos}"
RDEPENDS:hunspell-mos = " \
 hunspell-filesystem \
"
