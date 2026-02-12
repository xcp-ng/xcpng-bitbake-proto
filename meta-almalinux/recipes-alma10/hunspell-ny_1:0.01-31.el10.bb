
inherit dnf-bridge

PN = "hunspell-ny"
PE = "1"
PV = "0.01"
PR = "31.el10"
PACKAGES = "hunspell-ny"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ny-0.01-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ny = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ny-0.01-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ny}"
RDEPENDS:hunspell-ny = " \
 hunspell \
"
