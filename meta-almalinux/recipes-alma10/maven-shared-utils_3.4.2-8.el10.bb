
PN = "maven-shared-utils"
PE = "0"
PV = "3.4.2"
PR = "8.el10"
PACKAGES = "maven-shared-utils maven-shared-utils-javadoc"


URI_maven-shared-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-shared-utils-3.4.2-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-utils = " \
 apache-commons-io \
 javapackages-filesystem \
 slf4j \
"

URI_maven-shared-utils-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-shared-utils-javadoc-3.4.2-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-utils-javadoc = " \
 javapackages-filesystem \
"
