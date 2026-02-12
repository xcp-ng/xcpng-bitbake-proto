
inherit dnf-bridge

PN = "hunspell-as"
PE = "0"
PV = "1.0.3"
PR = "34.el10"
PACKAGES = "hunspell-as"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-as-1.0.3-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-as = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-as-1.0.3-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-as}"
RDEPENDS:hunspell-as = " \
 hunspell-filesystem \
"
