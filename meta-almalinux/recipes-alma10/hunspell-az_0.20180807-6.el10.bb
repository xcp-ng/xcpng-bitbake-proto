
inherit dnf-bridge

PN = "hunspell-az"
PE = "0"
PV = "0.20180807"
PR = "6.el10"
PACKAGES = "hunspell-az"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-az-0.20180807-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-az = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-az-0.20180807-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-az}"
RDEPENDS:hunspell-az = " \
 hunspell-filesystem \
"
