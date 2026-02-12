
inherit dnf-bridge

PN = "hunspell-tk"
PE = "1"
PV = "0.02"
PR = "29.el10"
PACKAGES = "hunspell-tk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-tk-0.02-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-tk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-tk-0.02-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-tk}"
RDEPENDS:hunspell-tk = " \
 hunspell-filesystem \
"
