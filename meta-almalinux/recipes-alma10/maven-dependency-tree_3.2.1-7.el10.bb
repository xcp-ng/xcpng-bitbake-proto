
PN = "maven-dependency-tree"
PE = "0"
PV = "3.2.1"
PR = "7.el10"
PACKAGES = "maven-dependency-tree maven-dependency-tree-javadoc"


URI_maven-dependency-tree = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-tree-3.2.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-tree = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.eclipse.aether:aether-util) ( )"
RPROVIDES:maven-dependency-tree = "maven-dependency-tree ( =  3.2.1-7.el10) mvn(org.apache.maven.shared:maven-dependency-tree) ( =  3.2.1) mvn(org.apache.maven.shared:maven-dependency-tree:pom:) ( =  3.2.1)"

URI_maven-dependency-tree-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-tree-javadoc-3.2.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-dependency-tree-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-dependency-tree-javadoc = "maven-dependency-tree-javadoc ( =  3.2.1-7.el10)"
