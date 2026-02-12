
inherit dnf-bridge

PN = "hunspell-so"
PE = "0"
PV = "1.0.2"
PR = "31.el10"
PACKAGES = "hunspell-so"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-so-1.0.2-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-so = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-so-1.0.2-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-so}"
RDEPENDS:hunspell-so = " \
 hunspell \
"
