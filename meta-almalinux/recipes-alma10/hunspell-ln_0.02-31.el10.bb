
inherit dnf-bridge

PN = "hunspell-ln"
PE = "0"
PV = "0.02"
PR = "31.el10"
PACKAGES = "hunspell-ln"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ln-0.02-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ln = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ln-0.02-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ln}"
RDEPENDS:hunspell-ln = " \
 hunspell-filesystem \
"
