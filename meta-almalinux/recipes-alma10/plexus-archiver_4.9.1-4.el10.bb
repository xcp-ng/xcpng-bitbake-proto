
PN = "plexus-archiver"
PE = "0"
PV = "4.9.1"
PR = "4.el10"
PACKAGES = "plexus-archiver plexus-archiver-javadoc"


URI_plexus-archiver = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-archiver-4.9.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-archiver = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(commons-io:commons-io) ( ) mvn(javax.inject:javax.inject) ( ) mvn(org.apache.commons:commons-compress) ( ) mvn(org.codehaus.plexus:plexus-io) ( ) mvn(org.tukaani:xz) ( )"
RPROVIDES:plexus-archiver = "mvn(org.codehaus.plexus:plexus-archiver) ( =  4.9.1) mvn(org.codehaus.plexus:plexus-archiver:pom:) ( =  4.9.1) plexus-archiver ( =  4.9.1-4.el10)"

URI_plexus-archiver-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-archiver-javadoc-4.9.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-archiver-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-archiver-javadoc = "plexus-archiver-javadoc ( =  4.9.1-4.el10)"
