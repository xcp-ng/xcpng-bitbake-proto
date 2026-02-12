
inherit dnf-bridge

PN = "hunspell-ast"
PE = "1"
PV = "2.0"
PR = "16.el10"
PACKAGES = "hunspell-ast"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-ast-2.0-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-ast = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-ast-2.0-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-ast}"
RDEPENDS:hunspell-ast = " \
 hunspell-filesystem \
"
