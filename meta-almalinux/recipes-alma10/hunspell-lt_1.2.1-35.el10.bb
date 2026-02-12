
inherit dnf-bridge

PN = "hunspell-lt"
PE = "0"
PV = "1.2.1"
PR = "35.el10"
PACKAGES = "hunspell-lt"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-lt-1.2.1-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-lt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-lt-1.2.1-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-lt}"
RDEPENDS:hunspell-lt = " \
 hunspell-filesystem \
"
