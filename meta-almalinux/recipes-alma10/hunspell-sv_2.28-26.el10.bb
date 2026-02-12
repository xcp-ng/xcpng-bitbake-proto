
inherit dnf-bridge

PN = "hunspell-sv"
PE = "0"
PV = "2.28"
PR = "26.el10"
PACKAGES = "hunspell-sv"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-sv-2.28-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-sv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-sv-2.28-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-sv}"
RDEPENDS:hunspell-sv = " \
 hunspell \
"
