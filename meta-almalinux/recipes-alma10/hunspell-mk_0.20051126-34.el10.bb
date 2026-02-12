
inherit dnf-bridge

PN = "hunspell-mk"
PE = "0"
PV = "0.20051126"
PR = "34.el10"
PACKAGES = "hunspell-mk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-mk-0.20051126-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-mk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-mk-0.20051126-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-mk}"
RDEPENDS:hunspell-mk = " \
 hunspell-filesystem \
"
