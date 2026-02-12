
inherit dnf-bridge

PN = "maven-common-artifact-filters"
PE = "0"
PV = "3.3.2"
PR = "7.el10"
PACKAGES = "maven-common-artifact-filters maven-common-artifact-filters-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-common-artifact-filters-3.3.2-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-common-artifact-filters = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-common-artifact-filters-3.3.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-common-artifact-filters}"
RDEPENDS:maven-common-artifact-filters = " \
 javapackages-filesystem \
 slf4j \
"

URI_maven-common-artifact-filters-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-common-artifact-filters-javadoc-3.3.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-common-artifact-filters-javadoc}"
RDEPENDS:maven-common-artifact-filters-javadoc = " \
 javapackages-filesystem \
"
