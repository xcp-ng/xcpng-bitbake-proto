
inherit dnf-bridge

PN = "hunspell-mn"
PE = "0"
PV = "0.20080709"
PR = "33.el10"
PACKAGES = "hunspell-mn"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-mn-0.20080709-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-mn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-mn-0.20080709-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-mn}"
RDEPENDS:hunspell-mn = " \
 hunspell-filesystem \
"
