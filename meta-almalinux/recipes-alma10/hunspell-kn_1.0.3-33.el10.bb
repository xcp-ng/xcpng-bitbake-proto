
inherit dnf-bridge

PN = "hunspell-kn"
PE = "0"
PV = "1.0.3"
PR = "33.el10"
PACKAGES = "hunspell-kn"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-kn-1.0.3-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-kn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-kn-1.0.3-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-kn}"
RDEPENDS:hunspell-kn = " \
 hunspell-filesystem \
"
