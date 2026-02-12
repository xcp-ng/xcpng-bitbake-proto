
inherit dnf-bridge

PN = "hunspell-se"
PE = "0"
PV = "1.0"
PR = "0.32.beta7.el10"
PACKAGES = "hunspell-se"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-se-1.0-0.32.beta7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-se = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-se-1.0-0.32.beta7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-se}"
RDEPENDS:hunspell-se = " \
 hunspell \
"
