
inherit dnf-bridge

PN = "hunspell-eo"
PE = "1"
PV = "0.20100218"
PR = "17.el10"
PACKAGES = "hunspell-eo"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-eo-0.20100218-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-eo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-eo-0.20100218-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-eo}"
RDEPENDS:hunspell-eo = " \
 hunspell-filesystem \
"
