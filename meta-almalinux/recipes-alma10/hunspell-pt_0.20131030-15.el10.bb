
inherit dnf-bridge

PN = "hunspell-pt"
PE = "0"
PV = "0.20131030"
PR = "15.el10"
PACKAGES = "hunspell-pt hunspell-pt-BR"


URI_hunspell-pt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-pt-0.20131030-15.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-pt = " \
 hunspell \
"

URI_hunspell-pt-BR = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-pt-BR-0.20131030-15.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-pt-BR = " \
 hunspell \
"
