
inherit dnf-bridge

PN = "hunspell-mt"
PE = "0"
PV = "0.20110414"
PR = "18.el10"
PACKAGES = "hunspell-mt"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-mt-0.20110414-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-mt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-mt-0.20110414-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-mt}"
RDEPENDS:hunspell-mt = " \
 hunspell-filesystem \
"
