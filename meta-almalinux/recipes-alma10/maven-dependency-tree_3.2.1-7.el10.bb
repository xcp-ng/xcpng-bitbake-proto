
inherit dnf-bridge

PN = "maven-dependency-tree"
PE = "0"
PV = "3.2.1"
PR = "7.el10"
PACKAGES = "maven-dependency-tree maven-dependency-tree-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-dependency-tree-3.2.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-dependency-tree = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-tree-3.2.1-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-dependency-tree}"
RDEPENDS:maven-dependency-tree = " \
 maven-resolver \
 javapackages-filesystem \
 slf4j \
"

URI_maven-dependency-tree-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-tree-javadoc-3.2.1-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-dependency-tree-javadoc}"
RDEPENDS:maven-dependency-tree-javadoc = " \
 javapackages-filesystem \
"
