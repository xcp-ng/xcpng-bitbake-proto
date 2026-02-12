
inherit dnf-bridge

PN = "hunspell-cv"
PE = "0"
PV = "1.06"
PR = "18.el10"
PACKAGES = "hunspell-cv"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-cv-1.06-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-cv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-cv-1.06-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-cv}"
RDEPENDS:hunspell-cv = " \
 hunspell-filesystem \
"
