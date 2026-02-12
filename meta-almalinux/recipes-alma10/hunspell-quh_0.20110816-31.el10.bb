
inherit dnf-bridge

PN = "hunspell-quh"
PE = "0"
PV = "0.20110816"
PR = "31.el10"
PACKAGES = "hunspell-quh"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-quh-0.20110816-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-quh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-quh-0.20110816-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-quh}"
RDEPENDS:hunspell-quh = " \
 hunspell \
"
