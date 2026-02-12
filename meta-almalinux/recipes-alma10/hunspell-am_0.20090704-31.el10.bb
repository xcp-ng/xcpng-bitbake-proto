
inherit dnf-bridge

PN = "hunspell-am"
PE = "0"
PV = "0.20090704"
PR = "31.el10"
PACKAGES = "hunspell-am"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-am-0.20090704-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-am = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-am-0.20090704-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-am}"
RDEPENDS:hunspell-am = " \
 hunspell-filesystem \
"
