
inherit dnf-bridge

PN = "hunspell-hy"
PE = "0"
PV = "0.20.0"
PR = "30.el10"
PACKAGES = "hunspell-hy"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-hy-0.20.0-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-hy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-hy-0.20.0-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-hy}"
RDEPENDS:hunspell-hy = " \
 hunspell-filesystem \
"
