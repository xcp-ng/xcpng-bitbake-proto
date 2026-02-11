
PN = "maven-assembly-plugin"
PE = "0"
PV = "3.6.0"
PR = "7.el10"
PACKAGES = "maven-assembly-plugin maven-assembly-plugin-javadoc"


URI_maven-assembly-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-assembly-plugin-3.6.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-assembly-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(commons-io:commons-io) ( ) mvn(org.apache.maven.shared:maven-common-artifact-filters) ( ) mvn(org.codehaus.plexus:plexus-archiver) ( ) mvn(org.apache.maven:maven-archiver) ( ) mvn(org.apache.maven.shared:maven-filtering) ( ) mvn(org.codehaus.plexus:plexus-interpolation) ( ) mvn(org.codehaus.plexus:plexus-io) ( )"
RPROVIDES:maven-assembly-plugin = "maven-assembly-plugin ( =  3.6.0-7.el10) mvn(org.apache.maven.plugins:maven-assembly-plugin) ( =  3.6.0) mvn(org.apache.maven.plugins:maven-assembly-plugin:pom:) ( =  3.6.0)"

URI_maven-assembly-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-assembly-plugin-javadoc-3.6.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-assembly-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-assembly-plugin-javadoc = "maven-assembly-plugin-javadoc ( =  3.6.0-7.el10)"
