
inherit dnf-bridge

PN = "hunspell-fur"
PE = "0"
PV = "0.20050912"
PR = "33.el10"
PACKAGES = "hunspell-fur"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-fur-0.20050912-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-fur = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-fur-0.20050912-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-fur}"
RDEPENDS:hunspell-fur = " \
 hunspell-filesystem \
"
