
inherit dnf-bridge

PN = "hunspell-sc"
PE = "0"
PV = "0.20081101"
PR = "37.el10"
PACKAGES = "hunspell-sc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-sc-0.20081101-37.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-sc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-sc-0.20081101-37.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-sc}"
RDEPENDS:hunspell-sc = " \
 hunspell \
"
