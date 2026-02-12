
inherit dnf-bridge

PN = "hunspell-tl"
PE = "0"
PV = "0.20050109"
PR = "34.el10"
PACKAGES = "hunspell-tl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-tl-0.20050109-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-tl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-tl-0.20050109-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-tl}"
RDEPENDS:hunspell-tl = " \
 hunspell-filesystem \
"
