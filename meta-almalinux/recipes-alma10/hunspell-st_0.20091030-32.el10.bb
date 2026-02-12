
inherit dnf-bridge

PN = "hunspell-st"
PE = "0"
PV = "0.20091030"
PR = "32.el10"
PACKAGES = "hunspell-st"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-st-0.20091030-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-st = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-st-0.20091030-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-st}"
RDEPENDS:hunspell-st = " \
 hunspell \
"
