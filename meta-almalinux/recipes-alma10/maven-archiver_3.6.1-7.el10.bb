
PN = "maven-archiver"
PE = "0"
PV = "3.6.1"
PR = "7.el10"
PACKAGES = "maven-archiver maven-archiver-javadoc"


URI_maven-archiver = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-archiver-3.6.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-archiver = "
 plexus-archiver
 plexus-interpolation
 javapackages-filesystem
"

URI_maven-archiver-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-archiver-javadoc-3.6.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-archiver-javadoc = "
 javapackages-filesystem
"
