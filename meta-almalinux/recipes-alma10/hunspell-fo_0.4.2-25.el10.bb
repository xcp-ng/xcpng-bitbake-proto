
inherit dnf-bridge

PN = "hunspell-fo"
PE = "0"
PV = "0.4.2"
PR = "25.el10"
PACKAGES = "hunspell-fo"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-fo-0.4.2-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-fo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-fo-0.4.2-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-fo}"
RDEPENDS:hunspell-fo = " \
 hunspell-filesystem \
"
