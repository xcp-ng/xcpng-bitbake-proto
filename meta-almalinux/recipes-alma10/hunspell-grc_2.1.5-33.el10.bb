
inherit dnf-bridge

PN = "hunspell-grc"
PE = "0"
PV = "2.1.5"
PR = "33.el10"
PACKAGES = "hunspell-grc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-grc-2.1.5-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-grc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-grc-2.1.5-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-grc}"
RDEPENDS:hunspell-grc = " \
 hunspell-filesystem \
"
