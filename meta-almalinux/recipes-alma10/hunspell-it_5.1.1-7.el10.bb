
inherit dnf-bridge

PN = "hunspell-it"
PE = "0"
PV = "5.1.1"
PR = "7.el10"
PACKAGES = "hunspell-it"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-it-5.1.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-it = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-it-5.1.1-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-it}"
RDEPENDS:hunspell-it = " \
 hunspell-filesystem \
"
