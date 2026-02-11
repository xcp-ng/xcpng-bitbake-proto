
inherit dnf-bridge

PN = "maven-resources-plugin"
PE = "0"
PV = "3.3.1"
PR = "7.el10"
PACKAGES = "maven-resources-plugin maven-resources-plugin-javadoc"


URI_maven-resources-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-resources-plugin-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-resources-plugin = " \
 maven-filtering \
 plexus-interpolation \
 apache-commons-io \
 plexus-utils \
 javapackages-filesystem \
 apache-commons-lang3 \
"

URI_maven-resources-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-resources-plugin-javadoc-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-resources-plugin-javadoc = " \
 javapackages-filesystem \
"
