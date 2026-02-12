
inherit dnf-bridge

PN = "hunspell-uk"
PE = "0"
PV = "1.8.0"
PR = "18.el10"
PACKAGES = "hunspell-uk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-uk-1.8.0-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-uk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-uk-1.8.0-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-uk}"
RDEPENDS:hunspell-uk = " \
 hunspell-filesystem \
"
