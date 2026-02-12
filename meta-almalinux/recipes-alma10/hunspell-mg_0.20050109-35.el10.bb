
inherit dnf-bridge

PN = "hunspell-mg"
PE = "0"
PV = "0.20050109"
PR = "35.el10"
PACKAGES = "hunspell-mg"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-mg-0.20050109-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-mg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-mg-0.20050109-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-mg}"
RDEPENDS:hunspell-mg = " \
 hunspell-filesystem \
"
