
PN = "velocity"
PE = "0"
PV = "2.3"
PR = "6.el10"
PACKAGES = "velocity velocity-javadoc"


URI_velocity = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/velocity-2.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:velocity = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(commons-io:commons-io) ( ) mvn(org.apache.commons:commons-lang3) ( )"
RPROVIDES:velocity = "mvn(org.apache.velocity:velocity) ( =  2.3) mvn(org.apache.velocity:velocity-engine-core) ( =  2.3) mvn(org.apache.velocity:velocity-engine-core:pom:) ( =  2.3) mvn(org.apache.velocity:velocity-engine-parent:pom:) ( =  2.3) mvn(org.apache.velocity:velocity:pom:) ( =  2.3) mvn(velocity:velocity) ( =  2.3) mvn(velocity:velocity:pom:) ( =  2.3) osgi(org.apache.velocity.engine-core) ( =  2.3.0) velocity ( =  2.3-6.el10)"

URI_velocity-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/velocity-javadoc-2.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:velocity-javadoc = "javapackages-filesystem ( )"
RPROVIDES:velocity-javadoc = "velocity-javadoc ( =  2.3-6.el10)"
