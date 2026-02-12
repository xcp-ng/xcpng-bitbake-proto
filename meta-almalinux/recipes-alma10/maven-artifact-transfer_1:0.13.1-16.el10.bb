
inherit dnf-bridge

PN = "maven-artifact-transfer"
PE = "1"
PV = "0.13.1"
PR = "16.el10"
PACKAGES = "maven-artifact-transfer maven-artifact-transfer-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-artifact-transfer-0.13.1-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-artifact-transfer = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-artifact-transfer-0.13.1-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-artifact-transfer}"
RDEPENDS:maven-artifact-transfer = " \
 plexus-containers-component-annotations \
 plexus-utils \
 javapackages-filesystem \
 maven-common-artifact-filters \
 slf4j \
 maven-lib \
 maven-resolver \
"

URI_maven-artifact-transfer-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-artifact-transfer-javadoc-0.13.1-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-artifact-transfer-javadoc}"
RDEPENDS:maven-artifact-transfer-javadoc = " \
 javapackages-filesystem \
"
