
inherit dnf-bridge

PN = "hunspell-hr"
PE = "1"
PV = "0.20040608"
PR = "34.el10"
PACKAGES = "hunspell-hr hyphen-hr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-hr-0.20040608-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-hr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-hr-0.20040608-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-hr}"
RDEPENDS:hunspell-hr = " \
 hunspell-filesystem \
"

URI_hyphen-hr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-hr-0.20040608-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-hr}"
RDEPENDS:hyphen-hr = " \
 hyphen \
"
