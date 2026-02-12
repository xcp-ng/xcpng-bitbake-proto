
inherit dnf-bridge

PN = "hunspell-ia"
PE = "0"
PV = "0.20050226"
PR = "33.el10"
PACKAGES = "hunspell-ia"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ia-0.20050226-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ia = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ia-0.20050226-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ia}"
RDEPENDS:hunspell-ia = " \
 hunspell-filesystem \
"
