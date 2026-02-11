
PN = "maven-bundle-plugin"
PE = "0"
PV = "5.1.9"
PR = "8.el10"
PACKAGES = "maven-bundle-plugin maven-bundle-plugin-javadoc"


URI_maven-bundle-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-bundle-plugin-5.1.9-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-bundle-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.sonatype.plexus:plexus-build-api) ( ) mvn(org.apache.maven:maven-archiver) ( ) mvn(org.apache.maven.shared:maven-dependency-tree) ( ) mvn(biz.aQute.bnd:biz.aQute.bndlib) ( ) mvn(org.apache.felix:org.apache.felix.utils) ( )"
RPROVIDES:maven-bundle-plugin = "maven-bundle-plugin ( =  5.1.9-8.el10) mvn(org.apache.felix:maven-bundle-plugin) ( =  5.1.9) mvn(org.apache.felix:maven-bundle-plugin:pom:) ( =  5.1.9)"

URI_maven-bundle-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-bundle-plugin-javadoc-5.1.9-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-bundle-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-bundle-plugin-javadoc = "maven-bundle-plugin-javadoc ( =  5.1.9-8.el10) maven-plugin-bundle-javadoc ( =  5.1.9-8.el10)"
