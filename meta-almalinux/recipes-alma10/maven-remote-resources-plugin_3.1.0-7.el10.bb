
PN = "maven-remote-resources-plugin"
PE = "0"
PV = "3.1.0"
PR = "7.el10"
PACKAGES = "maven-remote-resources-plugin maven-remote-resources-plugin-javadoc"


URI_maven-remote-resources-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-remote-resources-plugin-3.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-remote-resources-plugin = " \
 maven-filtering \
 plexus-resources \
 apache-commons-io \
 plexus-utils \
 javapackages-filesystem \
 maven-archiver \
 maven-common-artifact-filters \
 velocity \
 maven-resolver \
"

URI_maven-remote-resources-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-remote-resources-plugin-javadoc-3.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-remote-resources-plugin-javadoc = " \
 javapackages-filesystem \
"
