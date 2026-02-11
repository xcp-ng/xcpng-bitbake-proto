
PN = "maven-resources-plugin"
PE = "0"
PV = "3.3.1"
PR = "7.el10"
PACKAGES = "maven-resources-plugin maven-resources-plugin-javadoc"


URI_maven-resources-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-resources-plugin-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-resources-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(commons-io:commons-io) ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(org.apache.maven.shared:maven-filtering) ( ) mvn(org.codehaus.plexus:plexus-interpolation) ( )"
RPROVIDES:maven-resources-plugin = "maven-resources-plugin ( =  3.3.1-7.el10) mvn(org.apache.maven.plugins:maven-resources-plugin) ( =  3.3.1) mvn(org.apache.maven.plugins:maven-resources-plugin:pom:) ( =  3.3.1)"

URI_maven-resources-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-resources-plugin-javadoc-3.3.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-resources-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-resources-plugin-javadoc = "maven-resources-plugin-javadoc ( =  3.3.1-7.el10)"
