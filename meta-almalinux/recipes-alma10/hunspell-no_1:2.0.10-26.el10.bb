
inherit dnf-bridge

PN = "hunspell-no"
PE = "1"
PV = "2.0.10"
PR = "26.el10"
PACKAGES = "hunspell-nb hunspell-nn hyphen-nb hyphen-nn"


URI_hunspell-nb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-nb-2.0.10-26.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-nb = " \
 hunspell \
"

URI_hunspell-nn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-nn-2.0.10-26.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-nn = " \
 hunspell \
"

URI_hyphen-nb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-nb-2.0.10-26.el10.noarch.rpm;unpack=0"
RDEPENDS:hyphen-nb = " \
 hyphen \
"

URI_hyphen-nn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-nn-2.0.10-26.el10.noarch.rpm;unpack=0"
RDEPENDS:hyphen-nn = " \
 hyphen \
"
