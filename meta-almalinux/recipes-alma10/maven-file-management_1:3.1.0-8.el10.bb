
PN = "maven-file-management"
PE = "1"
PV = "3.1.0"
PR = "8.el10"
PACKAGES = "maven-file-management maven-file-management-javadoc"


URI_maven-file-management = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-file-management-3.1.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-file-management = " \
 plexus-utils \
 apache-commons-io \
 javapackages-filesystem \
 slf4j \
"

URI_maven-file-management-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-file-management-javadoc-3.1.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-file-management-javadoc = " \
 javapackages-filesystem \
"
