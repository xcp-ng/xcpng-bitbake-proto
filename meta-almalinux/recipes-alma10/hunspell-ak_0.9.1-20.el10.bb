
inherit dnf-bridge

PN = "hunspell-ak"
PE = "0"
PV = "0.9.1"
PR = "20.el10"
PACKAGES = "hunspell-ak"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ak-0.9.1-20.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ak = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ak-0.9.1-20.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ak}"
RDEPENDS:hunspell-ak = " \
 hunspell-filesystem \
"
