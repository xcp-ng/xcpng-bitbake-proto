
inherit dnf-bridge

PN = "hunspell-vi"
PE = "0"
PV = "0.20120418"
PR = "18.el10"
PACKAGES = "hunspell-vi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-vi-0.20120418-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-vi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-vi-0.20120418-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-vi}"
RDEPENDS:hunspell-vi = " \
 hunspell-filesystem \
"
