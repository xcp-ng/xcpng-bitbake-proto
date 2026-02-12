
inherit dnf-bridge

PN = "hunspell-qu"
PE = "0"
PV = "0.9"
PR = "31.el10"
PACKAGES = "hunspell-qu"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-qu-0.9-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-qu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-qu-0.9-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-qu}"
RDEPENDS:hunspell-qu = " \
 hunspell \
"
