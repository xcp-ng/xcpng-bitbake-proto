
inherit dnf-bridge

PN = "hunspell-ar"
PE = "0"
PV = "3.5"
PR = "24.el10"
PACKAGES = "hunspell-ar"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ar-3.5-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ar-3.5-24.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ar}"
RDEPENDS:hunspell-ar = " \
 hunspell-filesystem \
"
