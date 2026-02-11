
PN = "maven-shared-utils"
PE = "0"
PV = "3.4.2"
PR = "8.el10"
PACKAGES = "maven-shared-utils maven-shared-utils-javadoc"


URI_maven-shared-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-shared-utils-3.4.2-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-utils = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(commons-io:commons-io) ( )"
RPROVIDES:maven-shared-utils = "maven-shared-utils ( =  3.4.2-8.el10) mvn(org.apache.maven.shared:maven-shared-utils) ( =  3.4.2) mvn(org.apache.maven.shared:maven-shared-utils:pom:) ( =  3.4.2)"

URI_maven-shared-utils-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-shared-utils-javadoc-3.4.2-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shared-utils-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-shared-utils-javadoc = "maven-shared-utils-javadoc ( =  3.4.2-8.el10)"
