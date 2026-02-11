
PN = "assertj-core"
PE = "0"
PV = "3.24.2"
PR = "9.el10"
PACKAGES = "assertj-core assertj-core-javadoc"


URI_assertj-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/assertj-core-3.24.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:assertj-core = "javapackages-filesystem ( ) mvn(net.bytebuddy:byte-buddy) ( )"
RPROVIDES:assertj-core = "assertj-core ( =  3.24.2-9.el10) jpms(org.assertj.core) ( =  3.24.2) mvn(org.assertj:assertj-bom:pom:) ( =  3.24.2) mvn(org.assertj:assertj-build:pom:) ( =  3.24.2) mvn(org.assertj:assertj-core) ( =  3.24.2) mvn(org.assertj:assertj-core-junit4-with-opentest4j:pom:) ( =  3.24.2) mvn(org.assertj:assertj-core-osgi:pom:) ( =  3.24.2) mvn(org.assertj:assertj-core-testng-with-junit4:pom:) ( =  3.24.2) mvn(org.assertj:assertj-core:pom:) ( =  3.24.2) mvn(org.assertj:assertj-guava) ( =  3.24.2) mvn(org.assertj:assertj-guava:pom:) ( =  3.24.2) mvn(org.assertj:assertj-integration-tests:pom:) ( =  3.24.2) mvn(org.assertj:assertj-parent:pom:) ( =  3.24.2) mvn(org.assertj:assertj-performance-tests:pom:) ( =  3.24.2) mvn(org.assertj:assertj-tests:pom:) ( =  3.24.2)"

URI_assertj-core-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/assertj-core-javadoc-3.24.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:assertj-core-javadoc = "javapackages-filesystem ( )"
RPROVIDES:assertj-core-javadoc = "assertj-core-javadoc ( =  3.24.2-9.el10)"
