
inherit dnf-bridge

PN = "hunspell-eu"
PE = "0"
PV = "5.1"
PR = "13.el10"
PACKAGES = "hunspell-eu"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-eu-5.1-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-eu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-eu-5.1-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-eu}"
RDEPENDS:hunspell-eu = " \
 hunspell-filesystem \
"
