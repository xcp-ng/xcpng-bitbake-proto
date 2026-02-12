
inherit dnf-bridge

PN = "hunspell-sl"
PE = "0"
PV = "0.20070127"
PR = "36.el10"
PACKAGES = "hunspell-sl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-sl-0.20070127-36.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-sl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-sl-0.20070127-36.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-sl}"
RDEPENDS:hunspell-sl = " \
 hunspell \
"
