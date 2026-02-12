
inherit dnf-bridge

PN = "hunspell-be"
PE = "0"
PV = "1.1"
PR = "32.el10"
PACKAGES = "hunspell-be hyphen-be"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-be-1.1-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-be = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-be-1.1-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-be}"
RDEPENDS:hunspell-be = " \
 hunspell-filesystem \
"

URI_hyphen-be = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-be-1.1-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-be}"
RDEPENDS:hyphen-be = " \
 hyphen \
"
