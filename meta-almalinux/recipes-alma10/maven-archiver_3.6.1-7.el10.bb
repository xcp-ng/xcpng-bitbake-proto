
PN = "maven-archiver"
PE = "0"
PV = "3.6.1"
PR = "7.el10"
PACKAGES = "maven-archiver maven-archiver-javadoc"


URI_maven-archiver = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-archiver-3.6.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-archiver = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-archiver) ( ) mvn(org.codehaus.plexus:plexus-interpolation) ( )"
RPROVIDES:maven-archiver = "maven-archiver ( =  3.6.1-7.el10) mvn(org.apache.maven:maven-archiver) ( =  3.6.1) mvn(org.apache.maven:maven-archiver:pom:) ( =  3.6.1)"

URI_maven-archiver-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-archiver-javadoc-3.6.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-archiver-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-archiver-javadoc = "maven-archiver-javadoc ( =  3.6.1-7.el10)"
