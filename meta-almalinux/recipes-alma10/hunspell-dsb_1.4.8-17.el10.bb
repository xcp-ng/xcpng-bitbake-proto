
inherit dnf-bridge

PN = "hunspell-dsb"
PE = "0"
PV = "1.4.8"
PR = "17.el10"
PACKAGES = "hunspell-dsb"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-dsb-1.4.8-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-dsb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-dsb-1.4.8-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-dsb}"
RDEPENDS:hunspell-dsb = " \
 hunspell-filesystem \
"
