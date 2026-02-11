
PN = "plexus-testing"
PE = "0"
PV = "1.3.0"
PR = "4.el10"
PACKAGES = "plexus-testing plexus-testing-javadoc"


URI_plexus-testing = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-testing-1.3.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-testing = "javapackages-filesystem ( ) mvn(org.eclipse.sisu:org.eclipse.sisu.plexus) ( ) mvn(com.google.inject:guice) ( ) mvn(org.eclipse.sisu:org.eclipse.sisu.inject) ( ) mvn(org.junit.jupiter:junit-jupiter-api) ( )"
RPROVIDES:plexus-testing = "mvn(org.codehaus.plexus:plexus-testing) ( =  1.3.0) mvn(org.codehaus.plexus:plexus-testing:pom:) ( =  1.3.0) plexus-testing ( =  1.3.0-4.el10)"

URI_plexus-testing-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-testing-javadoc-1.3.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-testing-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-testing-javadoc = "plexus-testing-javadoc ( =  1.3.0-4.el10)"
