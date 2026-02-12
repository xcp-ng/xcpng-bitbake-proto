
inherit dnf-bridge

PN = "hunspell-ur"
PE = "0"
PV = "0.64"
PR = "33.el10"
PACKAGES = "hunspell-ur"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ur-0.64-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ur = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ur-0.64-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ur}"
RDEPENDS:hunspell-ur = " \
 hunspell-filesystem \
"
