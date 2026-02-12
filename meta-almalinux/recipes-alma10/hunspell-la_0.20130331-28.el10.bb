
inherit dnf-bridge

PN = "hunspell-la"
PE = "0"
PV = "0.20130331"
PR = "28.el10"
PACKAGES = "hunspell-la"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-la-0.20130331-28.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-la = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-la-0.20130331-28.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-la}"
RDEPENDS:hunspell-la = " \
 hunspell-filesystem \
"
