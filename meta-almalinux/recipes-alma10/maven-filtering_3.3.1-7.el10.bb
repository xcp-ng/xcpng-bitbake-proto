
PN = "maven-filtering"
PE = "0"
PV = "3.3.1"
PR = "7.el10"
PACKAGES = "maven-filtering maven-filtering-javadoc"


URI_maven-filtering = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-filtering-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-filtering = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(commons-io:commons-io) ( ) mvn(org.sonatype.plexus:plexus-build-api) ( ) mvn(javax.inject:javax.inject) ( ) mvn(org.codehaus.plexus:plexus-interpolation) ( )"
RPROVIDES:maven-filtering = "maven-filtering ( =  3.3.1-7.el10) mvn(org.apache.maven.shared:maven-filtering) ( =  3.3.1) mvn(org.apache.maven.shared:maven-filtering:pom:) ( =  3.3.1)"

URI_maven-filtering-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-filtering-javadoc-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-filtering-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-filtering-javadoc = "maven-filtering-javadoc ( =  3.3.1-7.el10)"
