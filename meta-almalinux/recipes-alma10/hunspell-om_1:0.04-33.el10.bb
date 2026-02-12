
inherit dnf-bridge

PN = "hunspell-om"
PE = "1"
PV = "0.04"
PR = "33.el10"
PACKAGES = "hunspell-om"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-om-0.04-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-om = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-om-0.04-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-om}"
RDEPENDS:hunspell-om = " \
 hunspell \
"
