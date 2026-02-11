
inherit dnf-bridge

PN = "hunspell-hi"
PE = "1"
PV = "1.0.0"
PR = "26.el10"
PACKAGES = "hunspell-hi"


URI_hunspell-hi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-hi-1.0.0-26.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-hi = " \
 hunspell-filesystem \
"
