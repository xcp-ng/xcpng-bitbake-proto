
inherit dnf-bridge

PN = "hunspell-tpi"
PE = "0"
PV = "0.07"
PR = "27.el10"
PACKAGES = "hunspell-tpi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-tpi-0.07-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-tpi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-tpi-0.07-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-tpi}"
RDEPENDS:hunspell-tpi = " \
 hunspell-filesystem \
"
