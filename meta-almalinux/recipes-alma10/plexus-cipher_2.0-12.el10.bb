
PN = "plexus-cipher"
PE = "0"
PV = "2.0"
PR = "12.el10"
PACKAGES = "plexus-cipher plexus-cipher-javadoc"


URI_plexus-cipher = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-cipher-2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-cipher = "javapackages-filesystem ( ) mvn(javax.inject:javax.inject) ( )"
RPROVIDES:plexus-cipher = "mvn(org.codehaus.plexus:plexus-cipher) ( =  2.0) mvn(org.codehaus.plexus:plexus-cipher:pom:) ( =  2.0) mvn(org.sonatype.plexus:plexus-cipher) ( =  2.0) mvn(org.sonatype.plexus:plexus-cipher:pom:) ( =  2.0) plexus-cipher ( =  2.0-12.el10)"

URI_plexus-cipher-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-cipher-javadoc-2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-cipher-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-cipher-javadoc = "plexus-cipher-javadoc ( =  2.0-12.el10)"
