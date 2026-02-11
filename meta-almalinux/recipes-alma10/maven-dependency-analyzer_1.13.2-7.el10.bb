
PN = "maven-dependency-analyzer"
PE = "0"
PV = "1.13.2"
PR = "7.el10"
PACKAGES = "maven-dependency-analyzer maven-dependency-analyzer-javadoc"


URI_maven-dependency-analyzer = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-analyzer-1.13.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-analyzer = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.ow2.asm:asm) ( ) mvn(commons-io:commons-io) ( ) mvn(javax.inject:javax.inject) ( ) mvn(org.apache.maven:maven-core) ( ) mvn(org.apache.maven:maven-model) ( ) mvn(org.apache.maven:maven-artifact) ( )"
RPROVIDES:maven-dependency-analyzer = "maven-dependency-analyzer ( =  1.13.2-7.el10) mvn(org.apache.maven.shared:maven-dependency-analyzer) ( =  1.13.2) mvn(org.apache.maven.shared:maven-dependency-analyzer:pom:) ( =  1.13.2)"

URI_maven-dependency-analyzer-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-analyzer-javadoc-1.13.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-analyzer-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-dependency-analyzer-javadoc = "maven-dependency-analyzer-javadoc ( =  1.13.2-7.el10)"
