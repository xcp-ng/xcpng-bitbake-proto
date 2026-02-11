
PN = "maven-bundle-plugin"
PE = "0"
PV = "5.1.9"
PR = "8.el10"
PACKAGES = "maven-bundle-plugin maven-bundle-plugin-javadoc"


URI_maven-bundle-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-bundle-plugin-5.1.9-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-bundle-plugin = " \
 aqute-bndlib \
 plexus-utils \
 javapackages-filesystem \
 maven-archiver \
 plexus-build-api0 \
 felix-utils \
 slf4j \
 maven-dependency-tree \
"

URI_maven-bundle-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-bundle-plugin-javadoc-5.1.9-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-bundle-plugin-javadoc = " \
 javapackages-filesystem \
"
