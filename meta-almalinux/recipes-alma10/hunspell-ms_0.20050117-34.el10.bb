
inherit dnf-bridge

PN = "hunspell-ms"
PE = "0"
PV = "0.20050117"
PR = "34.el10"
PACKAGES = "hunspell-ms"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ms-0.20050117-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ms = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ms-0.20050117-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ms}"
RDEPENDS:hunspell-ms = " \
 hunspell-filesystem \
"
