
inherit dnf-bridge

PN = "hunspell-xh"
PE = "0"
PV = "0.20091030"
PR = "31.el10"
PACKAGES = "hunspell-xh"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-xh-0.20091030-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-xh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-xh-0.20091030-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-xh}"
RDEPENDS:hunspell-xh = " \
 hunspell-filesystem \
"
