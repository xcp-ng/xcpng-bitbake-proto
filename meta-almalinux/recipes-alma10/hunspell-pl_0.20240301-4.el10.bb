
inherit dnf-bridge

PN = "hunspell-pl"
PE = "0"
PV = "0.20240301"
PR = "4.el10"
PACKAGES = "hunspell-pl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-pl-0.20240301-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-pl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-pl-0.20240301-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-pl}"
RDEPENDS:hunspell-pl = " \
 hunspell \
"
