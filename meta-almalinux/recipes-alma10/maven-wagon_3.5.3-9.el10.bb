
PN = "maven-wagon"
PE = "0"
PV = "3.5.3"
PR = "9.el10"
PACKAGES = "maven-wagon maven-wagon-javadoc"


URI_maven-wagon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-wagon-3.5.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-wagon = "
 httpcomponents-client
 httpcomponents-core
 plexus-utils
 javapackages-filesystem
 slf4j
 jcl-over-slf4j
"

URI_maven-wagon-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-wagon-javadoc-3.5.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-wagon-javadoc = "
 javapackages-filesystem
"
