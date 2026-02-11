
PN = "maven-shared-io"
PE = "1"
PV = "3.0.0"
PR = "27.el10"
PACKAGES = "maven-shared-io maven-shared-io-javadoc"


URI_maven-shared-io = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-shared-io-3.0.0-27.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-io = " \
 plexus-utils \
 javapackages-filesystem \
 maven-lib \
 maven-shared-utils \
 maven-wagon \
"

URI_maven-shared-io-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-shared-io-javadoc-3.0.0-27.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-io-javadoc = " \
 javapackages-filesystem \
"
