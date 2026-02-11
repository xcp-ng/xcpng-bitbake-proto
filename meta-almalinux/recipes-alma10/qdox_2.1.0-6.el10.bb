
inherit dnf-bridge

PN = "qdox"
PE = "0"
PV = "2.1.0"
PR = "6.el10"
PACKAGES = "qdox qdox-javadoc"


URI_qdox = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qdox-2.1.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:qdox = " \
 javapackages-filesystem \
"

URI_qdox-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qdox-javadoc-2.1.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:qdox-javadoc = " \
 javapackages-filesystem \
"
