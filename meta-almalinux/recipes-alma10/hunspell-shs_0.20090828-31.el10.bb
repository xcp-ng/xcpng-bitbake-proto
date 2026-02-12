
inherit dnf-bridge

PN = "hunspell-shs"
PE = "0"
PV = "0.20090828"
PR = "31.el10"
PACKAGES = "hunspell-shs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-shs-0.20090828-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-shs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-shs-0.20090828-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-shs}"
RDEPENDS:hunspell-shs = " \
 hunspell \
"
