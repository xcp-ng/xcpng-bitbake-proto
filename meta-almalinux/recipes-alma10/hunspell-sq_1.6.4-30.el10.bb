
inherit dnf-bridge

PN = "hunspell-sq"
PE = "0"
PV = "1.6.4"
PR = "30.el10"
PACKAGES = "hunspell-sq"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-sq-1.6.4-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-sq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-sq-1.6.4-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-sq}"
RDEPENDS:hunspell-sq = " \
 hunspell \
"
