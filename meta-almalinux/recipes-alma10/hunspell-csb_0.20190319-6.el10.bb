
inherit dnf-bridge

PN = "hunspell-csb"
PE = "0"
PV = "0.20190319"
PR = "6.el10"
PACKAGES = "hunspell-csb"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-csb-0.20190319-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-csb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-csb-0.20190319-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-csb}"
RDEPENDS:hunspell-csb = " \
 hunspell-filesystem \
"
