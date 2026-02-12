
inherit dnf-bridge

PN = "hunspell-gu"
PE = "1"
PV = "1.0.0"
PR = "26.el10"
PACKAGES = "hunspell-gu"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-gu-1.0.0-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-gu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-gu-1.0.0-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-gu}"
RDEPENDS:hunspell-gu = " \
 hunspell-filesystem \
"
