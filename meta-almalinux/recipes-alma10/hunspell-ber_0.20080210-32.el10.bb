
inherit dnf-bridge

PN = "hunspell-ber"
PE = "0"
PV = "0.20080210"
PR = "32.el10"
PACKAGES = "hunspell-ber"


URI_hunspell-ber = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ber-0.20080210-32.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-ber = " \
 hunspell-filesystem \
"
