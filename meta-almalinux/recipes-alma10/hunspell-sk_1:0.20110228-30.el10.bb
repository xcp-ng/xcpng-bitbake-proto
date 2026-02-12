
inherit dnf-bridge

PN = "hunspell-sk"
PE = "1"
PV = "0.20110228"
PR = "30.el10"
PACKAGES = "hunspell-sk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-sk-0.20110228-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-sk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-sk-0.20110228-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-sk}"
RDEPENDS:hunspell-sk = " \
 hunspell \
"
