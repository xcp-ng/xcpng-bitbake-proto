
PN = "maven-jar-plugin"
PE = "0"
PV = "3.3.0"
PR = "7.el10"
PACKAGES = "maven-jar-plugin maven-jar-plugin-javadoc"


URI_maven-jar-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-jar-plugin-3.3.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-jar-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.maven:maven-archiver) ( ) mvn(org.apache.maven.shared:file-management) ( )"
RPROVIDES:maven-jar-plugin = "maven-jar-plugin ( =  3.3.0-7.el10) mvn(org.apache.maven.plugins:maven-jar-plugin) ( =  3.3.0) mvn(org.apache.maven.plugins:maven-jar-plugin:pom:) ( =  3.3.0)"

URI_maven-jar-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-jar-plugin-javadoc-3.3.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-jar-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-jar-plugin-javadoc = "maven-jar-plugin-javadoc ( =  3.3.0-7.el10)"
