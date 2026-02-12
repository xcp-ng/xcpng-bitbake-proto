
inherit dnf-bridge

PN = "hunspell-gv"
PE = "0"
PV = "0.20040505"
PR = "35.el10"
PACKAGES = "hunspell-gv"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-gv-0.20040505-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-gv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-gv-0.20040505-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-gv}"
RDEPENDS:hunspell-gv = " \
 hunspell-filesystem \
"
