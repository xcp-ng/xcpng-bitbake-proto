
inherit dnf-bridge

PN = "hunspell-tr"
PE = "0"
PV = "1.1.0"
PR = "9.el10"
PACKAGES = "hunspell-tr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-tr-1.1.0-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-tr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-tr-1.1.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-tr}"
RDEPENDS:hunspell-tr = " \
 hunspell-filesystem \
"
