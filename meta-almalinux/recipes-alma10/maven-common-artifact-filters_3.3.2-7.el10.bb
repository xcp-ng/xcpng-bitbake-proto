
PN = "maven-common-artifact-filters"
PE = "0"
PV = "3.3.2"
PR = "7.el10"
PACKAGES = "maven-common-artifact-filters maven-common-artifact-filters-javadoc"


URI_maven-common-artifact-filters = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-common-artifact-filters-3.3.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-common-artifact-filters = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( )"
RPROVIDES:maven-common-artifact-filters = "maven-common-artifact-filters ( =  3.3.2-7.el10) mvn(org.apache.maven.shared:maven-common-artifact-filters) ( =  3.3.2) mvn(org.apache.maven.shared:maven-common-artifact-filters:pom:) ( =  3.3.2)"

URI_maven-common-artifact-filters-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-common-artifact-filters-javadoc-3.3.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-common-artifact-filters-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-common-artifact-filters-javadoc = "maven-common-artifact-filters-javadoc ( =  3.3.2-7.el10)"
