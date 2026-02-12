
inherit dnf-bridge

PN = "hunspell-yi"
PE = "0"
PV = "1.1"
PR = "32.el10"
PACKAGES = "hunspell-yi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-yi-1.1-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-yi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-yi-1.1-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-yi}"
RDEPENDS:hunspell-yi = " \
 hunspell-filesystem \
"
