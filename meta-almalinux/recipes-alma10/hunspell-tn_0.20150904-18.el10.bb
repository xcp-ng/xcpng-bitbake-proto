
inherit dnf-bridge

PN = "hunspell-tn"
PE = "0"
PV = "0.20150904"
PR = "18.el10"
PACKAGES = "hunspell-tn"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-tn-0.20150904-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-tn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-tn-0.20150904-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-tn}"
RDEPENDS:hunspell-tn = " \
 hunspell-filesystem \
"
