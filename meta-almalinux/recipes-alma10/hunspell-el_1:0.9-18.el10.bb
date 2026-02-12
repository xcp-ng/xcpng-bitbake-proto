
inherit dnf-bridge

PN = "hunspell-el"
PE = "1"
PV = "0.9"
PR = "18.el10"
PACKAGES = "hunspell-el"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-el-0.9-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-el = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-el-0.9-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-el}"
RDEPENDS:hunspell-el = " \
 hunspell-filesystem \
"
