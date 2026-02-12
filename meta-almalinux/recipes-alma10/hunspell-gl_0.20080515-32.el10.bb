
inherit dnf-bridge

PN = "hunspell-gl"
PE = "0"
PV = "0.20080515"
PR = "32.el10"
PACKAGES = "hunspell-gl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-gl-0.20080515-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-gl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-gl-0.20080515-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-gl}"
RDEPENDS:hunspell-gl = " \
 hunspell-filesystem \
"
