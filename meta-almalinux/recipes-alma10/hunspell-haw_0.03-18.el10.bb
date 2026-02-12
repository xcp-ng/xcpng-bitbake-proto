
inherit dnf-bridge

PN = "hunspell-haw"
PE = "0"
PV = "0.03"
PR = "18.el10"
PACKAGES = "hunspell-haw"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-haw-0.03-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-haw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-haw-0.03-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-haw}"
RDEPENDS:hunspell-haw = " \
 hunspell-filesystem \
"
