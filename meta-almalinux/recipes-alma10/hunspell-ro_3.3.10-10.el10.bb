
inherit dnf-bridge

PN = "hunspell-ro"
PE = "0"
PV = "3.3.10"
PR = "10.el10"
PACKAGES = "hunspell-ro"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ro-3.3.10-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ro-3.3.10-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ro}"
RDEPENDS:hunspell-ro = " \
 hunspell \
"
