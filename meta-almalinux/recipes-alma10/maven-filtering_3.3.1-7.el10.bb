
inherit dnf-bridge

PN = "maven-filtering"
PE = "0"
PV = "3.3.1"
PR = "7.el10"
PACKAGES = "maven-filtering maven-filtering-javadoc"


URI_maven-filtering = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-filtering-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-filtering = " \
 atinject \
 plexus-interpolation \
 apache-commons-io \
 plexus-utils \
 javapackages-filesystem \
 plexus-build-api0 \
 slf4j \
"

URI_maven-filtering-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-filtering-javadoc-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-filtering-javadoc = " \
 javapackages-filesystem \
"
