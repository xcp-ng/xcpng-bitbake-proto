
inherit dnf-bridge

PN = "qdox"
PE = "0"
PV = "2.1.0"
PR = "6.el10"
PACKAGES = "qdox qdox-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/qdox-2.1.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qdox = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qdox-2.1.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_qdox}"
RDEPENDS:qdox = " \
 javapackages-filesystem \
"

URI_qdox-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qdox-javadoc-2.1.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_qdox-javadoc}"
RDEPENDS:qdox-javadoc = " \
 javapackages-filesystem \
"
