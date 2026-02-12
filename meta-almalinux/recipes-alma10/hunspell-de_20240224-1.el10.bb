
inherit dnf-bridge

PN = "hunspell-de"
PE = "0"
PV = "20240224"
PR = "1.el10"
PACKAGES = "hunspell-de"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-de-20240224-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-de = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-de-20240224-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-de}"
RDEPENDS:hunspell-de = " \
 hunspell-filesystem \
"
