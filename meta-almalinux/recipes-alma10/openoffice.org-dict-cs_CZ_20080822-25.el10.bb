
inherit dnf-bridge

PN = "openoffice.org-dict-cs_CZ"
PE = "0"
PV = "20080822"
PR = "25.el10"
PACKAGES = "hunspell-cs hyphen-cs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/openoffice.org-dict-cs_CZ-20080822-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-cs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-cs-20080822-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-cs}"
RDEPENDS:hunspell-cs = " \
 hunspell \
"

URI_hyphen-cs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-cs-20080822-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-cs}"
RDEPENDS:hyphen-cs = " \
 hyphen \
"
