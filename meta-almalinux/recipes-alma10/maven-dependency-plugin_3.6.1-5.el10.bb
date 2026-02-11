
inherit dnf-bridge

PN = "maven-dependency-plugin"
PE = "0"
PV = "3.6.1"
PR = "5.el10"
PACKAGES = "maven-dependency-plugin maven-dependency-plugin-javadoc"


URI_maven-dependency-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-plugin-3.6.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-plugin = " \
 plexus-utils \
 javapackages-filesystem \
 apache-commons-lang3 \
 maven-artifact-transfer \
 apache-commons-collections \
 maven-common-artifact-filters \
 plexus-archiver \
 plexus-build-api0 \
 maven-dependency-analyzer \
 maven-dependency-tree \
 maven-shared-utils \
 plexus-io \
"

URI_maven-dependency-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-plugin-javadoc-3.6.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-plugin-javadoc = " \
 javapackages-filesystem \
"
