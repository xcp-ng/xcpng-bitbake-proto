
PN = "maven-shared-incremental"
PE = "0"
PV = "1.1"
PR = "34.el10"
PACKAGES = "maven-shared-incremental maven-shared-incremental-javadoc"


URI_maven-shared-incremental = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-shared-incremental-1.1-34.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-incremental = "javapackages-filesystem ( ) mvn(org.apache.maven.shared:maven-shared-utils) ( ) mvn(org.apache.maven:maven-core) ( ) mvn(org.apache.maven:maven-plugin-api) ( ) mvn(org.codehaus.plexus:plexus-component-annotations) ( )"
RPROVIDES:maven-shared-incremental = "maven-shared-incremental ( =  1.1-34.el10) mvn(org.apache.maven.shared:maven-shared-incremental) ( =  1.1) mvn(org.apache.maven.shared:maven-shared-incremental:pom:) ( =  1.1)"

URI_maven-shared-incremental-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-shared-incremental-javadoc-1.1-34.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-incremental-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-shared-incremental-javadoc = "maven-shared-incremental-javadoc ( =  1.1-34.el10)"
