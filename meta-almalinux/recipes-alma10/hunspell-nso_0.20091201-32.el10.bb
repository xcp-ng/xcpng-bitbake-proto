
inherit dnf-bridge

PN = "hunspell-nso"
PE = "0"
PV = "0.20091201"
PR = "32.el10"
PACKAGES = "hunspell-nso"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-nso-0.20091201-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-nso = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-nso-0.20091201-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-nso}"
RDEPENDS:hunspell-nso = " \
 hunspell \
"
