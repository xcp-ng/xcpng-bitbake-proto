
inherit dnf-bridge

PN = "bcel"
PE = "0"
PV = "6.8.1"
PR = "4.el10"
PACKAGES = "bcel bcel-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/bcel-6.8.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bcel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bcel-6.8.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_bcel}"
RDEPENDS:bcel = " \
 javapackages-filesystem \
 apache-commons-lang3 \
"

URI_bcel-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bcel-javadoc-6.8.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_bcel-javadoc}"
RDEPENDS:bcel-javadoc = " \
 javapackages-filesystem \
"
