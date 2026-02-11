
PN = "plexus-io"
PE = "0"
PV = "3.4.2"
PR = "4.el10"
PACKAGES = "plexus-io plexus-io-javadoc"


URI_plexus-io = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-io-3.4.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-io = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(commons-io:commons-io) ( ) mvn(javax.inject:javax.inject) ( )"
RPROVIDES:plexus-io = "mvn(org.codehaus.plexus:plexus-io) ( =  3.4.2) mvn(org.codehaus.plexus:plexus-io:pom:) ( =  3.4.2) plexus-io ( =  3.4.2-4.el10)"

URI_plexus-io-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-io-javadoc-3.4.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-io-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-io-javadoc = "plexus-io-javadoc ( =  3.4.2-4.el10)"
