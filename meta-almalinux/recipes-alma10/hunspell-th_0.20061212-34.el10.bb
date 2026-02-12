
inherit dnf-bridge

PN = "hunspell-th"
PE = "0"
PV = "0.20061212"
PR = "34.el10"
PACKAGES = "hunspell-th"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-th-0.20061212-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-th = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-th-0.20061212-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-th}"
RDEPENDS:hunspell-th = " \
 hunspell-filesystem \
"
