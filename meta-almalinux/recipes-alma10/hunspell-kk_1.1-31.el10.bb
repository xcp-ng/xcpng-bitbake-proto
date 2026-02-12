
inherit dnf-bridge

PN = "hunspell-kk"
PE = "0"
PV = "1.1"
PR = "31.el10"
PACKAGES = "hunspell-kk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-kk-1.1-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-kk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-kk-1.1-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-kk}"
RDEPENDS:hunspell-kk = " \
 hunspell-filesystem \
"
