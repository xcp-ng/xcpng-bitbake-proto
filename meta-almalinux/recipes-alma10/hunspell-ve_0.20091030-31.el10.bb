
inherit dnf-bridge

PN = "hunspell-ve"
PE = "0"
PV = "0.20091030"
PR = "31.el10"
PACKAGES = "hunspell-ve"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ve-0.20091030-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ve = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ve-0.20091030-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ve}"
RDEPENDS:hunspell-ve = " \
 hunspell-filesystem \
"
