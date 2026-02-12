
inherit dnf-bridge

PN = "hunspell-bg"
PE = "0"
PV = "4.3"
PR = "31.el10"
PACKAGES = "hunspell-bg"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-bg-4.3-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-bg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-bg-4.3-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-bg}"
RDEPENDS:hunspell-bg = " \
 hunspell-filesystem \
"
