
inherit dnf-bridge

PN = "hunspell-sr"
PE = "0"
PV = "0.20130330"
PR = "28.el10"
PACKAGES = "hunspell-sr hyphen-sr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-sr-0.20130330-28.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-sr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-sr-0.20130330-28.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-sr}"
RDEPENDS:hunspell-sr = " \
 hunspell \
"

URI_hyphen-sr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-sr-0.20130330-28.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-sr}"
RDEPENDS:hyphen-sr = " \
 hyphen \
"
