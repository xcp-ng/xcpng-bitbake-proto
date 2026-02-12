
inherit dnf-bridge

PN = "hunspell-pt"
PE = "0"
PV = "0.20131030"
PR = "15.el10"
PACKAGES = "hunspell-pt hunspell-pt-BR"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-pt-0.20131030-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-pt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-pt-0.20131030-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-pt}"
RDEPENDS:hunspell-pt = " \
 hunspell \
"

URI_hunspell-pt-BR = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-pt-BR-0.20131030-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-pt-BR}"
RDEPENDS:hunspell-pt-BR = " \
 hunspell \
"
