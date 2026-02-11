
PN = "maven-remote-resources-plugin"
PE = "0"
PV = "3.1.0"
PR = "7.el10"
PACKAGES = "maven-remote-resources-plugin maven-remote-resources-plugin-javadoc"


URI_maven-remote-resources-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-remote-resources-plugin-3.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-remote-resources-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(commons-io:commons-io) ( ) mvn(org.apache.maven.shared:maven-common-artifact-filters) ( ) mvn(org.eclipse.aether:aether-util) ( ) mvn(org.apache.maven:maven-archiver) ( ) mvn(org.apache.maven.shared:maven-filtering) ( ) mvn(org.apache.velocity:velocity-engine-core) ( ) mvn(org.codehaus.plexus:plexus-resources) ( )"
RPROVIDES:maven-remote-resources-plugin = "maven-remote-resources-plugin ( =  3.1.0-7.el10) mvn(org.apache.maven.plugins:maven-remote-resources-plugin) ( =  3.1.0) mvn(org.apache.maven.plugins:maven-remote-resources-plugin:pom:) ( =  3.1.0)"

URI_maven-remote-resources-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-remote-resources-plugin-javadoc-3.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-remote-resources-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-remote-resources-plugin-javadoc = "maven-remote-resources-plugin-javadoc ( =  3.1.0-7.el10)"
