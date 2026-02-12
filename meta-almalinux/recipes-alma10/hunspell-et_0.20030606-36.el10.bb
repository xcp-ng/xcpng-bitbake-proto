
inherit dnf-bridge

PN = "hunspell-et"
PE = "0"
PV = "0.20030606"
PR = "36.el10"
PACKAGES = "hunspell-et hyphen-et"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-et-0.20030606-36.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-et = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-et-0.20030606-36.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-et}"
RDEPENDS:hunspell-et = " \
 hunspell-filesystem \
"

URI_hyphen-et = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-et-0.20030606-36.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-et}"
RDEPENDS:hyphen-et = " \
 hyphen \
"
