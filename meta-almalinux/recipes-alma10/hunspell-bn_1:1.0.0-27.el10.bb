
inherit dnf-bridge

PN = "hunspell-bn"
PE = "1"
PV = "1.0.0"
PR = "27.el10"
PACKAGES = "hunspell-bn"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-bn-1.0.0-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-bn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-bn-1.0.0-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-bn}"
RDEPENDS:hunspell-bn = " \
 hunspell-filesystem \
"
