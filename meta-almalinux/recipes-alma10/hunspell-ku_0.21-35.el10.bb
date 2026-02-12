
inherit dnf-bridge

PN = "hunspell-ku"
PE = "0"
PV = "0.21"
PR = "35.el10"
PACKAGES = "hunspell-ku"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ku-0.21-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ku = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ku-0.21-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ku}"
RDEPENDS:hunspell-ku = " \
 hunspell-filesystem \
"
