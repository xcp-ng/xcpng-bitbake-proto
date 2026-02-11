
PN = "maven-source-plugin"
PE = "0"
PV = "3.3.0"
PR = "7.el10"
PACKAGES = "maven-source-plugin maven-source-plugin-javadoc"


URI_maven-source-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-source-plugin-3.3.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-source-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.codehaus.plexus:plexus-archiver) ( ) mvn(org.apache.maven:maven-archiver) ( )"
RPROVIDES:maven-source-plugin = "maven-source-plugin ( =  3.3.0-7.el10) mvn(org.apache.maven.plugins:maven-source-plugin) ( =  3.3.0) mvn(org.apache.maven.plugins:maven-source-plugin:pom:) ( =  3.3.0)"

URI_maven-source-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-source-plugin-javadoc-3.3.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-source-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-source-plugin-javadoc = "maven-source-plugin-javadoc ( =  3.3.0-7.el10)"
