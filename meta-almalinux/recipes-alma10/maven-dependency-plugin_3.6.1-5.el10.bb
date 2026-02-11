
PN = "maven-dependency-plugin"
PE = "0"
PV = "3.6.1"
PR = "5.el10"
PACKAGES = "maven-dependency-plugin maven-dependency-plugin-javadoc"


URI_maven-dependency-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-plugin-3.6.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.maven.shared:maven-common-artifact-filters) ( ) mvn(org.sonatype.plexus:plexus-build-api) ( ) mvn(org.codehaus.plexus:plexus-archiver) ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(org.apache.maven.shared:maven-shared-utils) ( ) mvn(commons-collections:commons-collections) ( ) mvn(org.apache.maven.shared:maven-dependency-tree) ( ) mvn(org.codehaus.plexus:plexus-io) ( ) mvn(org.apache.maven.shared:maven-artifact-transfer) ( ) mvn(org.apache.maven.shared:maven-dependency-analyzer) ( )"
RPROVIDES:maven-dependency-plugin = "maven-dependency-plugin ( =  3.6.1-5.el10) mvn(org.apache.maven.plugins:maven-dependency-plugin) ( =  3.6.1) mvn(org.apache.maven.plugins:maven-dependency-plugin:pom:) ( =  3.6.1)"

URI_maven-dependency-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-plugin-javadoc-3.6.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-dependency-plugin-javadoc = "maven-dependency-plugin-javadoc ( =  3.6.1-5.el10)"
