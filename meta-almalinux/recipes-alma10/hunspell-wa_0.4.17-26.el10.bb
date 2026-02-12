
inherit dnf-bridge

PN = "hunspell-wa"
PE = "0"
PV = "0.4.17"
PR = "26.el10"
PACKAGES = "hunspell-wa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-wa-0.4.17-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-wa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-wa-0.4.17-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-wa}"
RDEPENDS:hunspell-wa = " \
 hunspell-filesystem \
"
