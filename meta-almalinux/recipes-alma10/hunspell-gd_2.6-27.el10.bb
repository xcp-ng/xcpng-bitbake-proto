
inherit dnf-bridge

PN = "hunspell-gd"
PE = "0"
PV = "2.6"
PR = "27.el10"
PACKAGES = "hunspell-gd"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-gd-2.6-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-gd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-gd-2.6-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-gd}"
RDEPENDS:hunspell-gd = " \
 hunspell-filesystem \
"
