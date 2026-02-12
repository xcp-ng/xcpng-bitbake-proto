
inherit dnf-bridge

PN = "hunspell-lb"
PE = "0"
PV = "0.20121128"
PR = "26.el10"
PACKAGES = "hunspell-lb mythes-lb"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-lb-0.20121128-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-lb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-lb-0.20121128-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-lb}"
RDEPENDS:hunspell-lb = " \
 hunspell-filesystem \
"

URI_mythes-lb = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mythes-lb-0.20121128-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mythes-lb}"
RDEPENDS:mythes-lb = ""
