
PN = "extra-enforcer-rules"
PE = "0"
PV = "1.7.0"
PR = "7.el10"
PACKAGES = "extra-enforcer-rules extra-enforcer-rules-javadoc"


URI_extra-enforcer-rules = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/extra-enforcer-rules-1.7.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:extra-enforcer-rules = "javapackages-filesystem ( ) mvn(org.apache.maven.shared:maven-common-artifact-filters) ( ) mvn(org.apache.maven.shared:maven-dependency-tree) ( ) mvn(commons-codec:commons-codec) ( )"
RPROVIDES:extra-enforcer-rules = "extra-enforcer-rules ( =  1.7.0-7.el10) mvn(org.codehaus.mojo:extra-enforcer-rules) ( =  1.7.0) mvn(org.codehaus.mojo:extra-enforcer-rules:pom:) ( =  1.7.0)"

URI_extra-enforcer-rules-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/extra-enforcer-rules-javadoc-1.7.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:extra-enforcer-rules-javadoc = "javapackages-filesystem ( )"
RPROVIDES:extra-enforcer-rules-javadoc = "extra-enforcer-rules-javadoc ( =  1.7.0-7.el10)"
