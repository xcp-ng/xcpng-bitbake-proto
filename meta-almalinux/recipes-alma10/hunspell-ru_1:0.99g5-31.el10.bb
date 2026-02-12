
inherit dnf-bridge

PN = "hunspell-ru"
PE = "1"
PV = "0.99g5"
PR = "31.el10"
PACKAGES = "hunspell-ru"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ru-0.99g5-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ru = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ru-0.99g5-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ru}"
RDEPENDS:hunspell-ru = " \
 hunspell \
"
