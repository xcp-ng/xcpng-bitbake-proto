
PN = "plexus-sec-dispatcher"
PE = "0"
PV = "2.0"
PR = "14.el10"
PACKAGES = "plexus-sec-dispatcher plexus-sec-dispatcher-javadoc"


URI_plexus-sec-dispatcher = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-sec-dispatcher-2.0-14.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-sec-dispatcher = "javapackages-filesystem ( ) mvn(javax.inject:javax.inject) ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.codehaus.plexus:plexus-cipher) ( )"
RPROVIDES:plexus-sec-dispatcher = "mvn(org.codehaus.plexus:plexus-sec-dispatcher) ( =  2.0) mvn(org.codehaus.plexus:plexus-sec-dispatcher:pom:) ( =  2.0) mvn(org.sonatype.plexus:plexus-sec-dispatcher) ( =  2.0) mvn(org.sonatype.plexus:plexus-sec-dispatcher:pom:) ( =  2.0) plexus-sec-dispatcher ( =  2.0-14.el10)"

URI_plexus-sec-dispatcher-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-sec-dispatcher-javadoc-2.0-14.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-sec-dispatcher-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-sec-dispatcher-javadoc = "plexus-sec-dispatcher-javadoc ( =  2.0-14.el10)"
