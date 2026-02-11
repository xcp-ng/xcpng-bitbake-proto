
PN = "mockito"
PE = "0"
PV = "5.8.0"
PR = "6.el10"
PACKAGES = "mockito mockito-javadoc mockito-junit-jupiter"


URI_mockito = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mockito-5.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mockito = "javapackages-filesystem ( ) mvn(junit:junit) ( ) mvn(org.objenesis:objenesis) ( ) mvn(net.bytebuddy:byte-buddy) ( ) mvn(net.bytebuddy:byte-buddy-agent) ( ) mvn(net.bytebuddy:byte-buddy-dep) ( ) mvn(org.opentest4j:opentest4j) ( )"
RPROVIDES:mockito = "mockito ( =  5.8.0-6.el10) mvn(org.mockito:mockito-core) ( =  5.8.0) mvn(org.mockito:mockito-all) ( =  5.8.0) mvn(org.mockito:mockito-all:pom:) ( =  5.8.0) mvn(org.mockito:mockito-core:pom:) ( =  5.8.0)"

URI_mockito-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mockito-javadoc-5.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mockito-javadoc = "javapackages-filesystem ( )"
RPROVIDES:mockito-javadoc = "mockito-javadoc ( =  5.8.0-6.el10)"

URI_mockito-junit-jupiter = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mockito-junit-jupiter-5.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mockito-junit-jupiter = "javapackages-filesystem ( ) mvn(org.junit.jupiter:junit-jupiter-api) ( ) mockito ( =  5.8.0-6.el10) mvn(org.mockito:mockito-core) ( =  5.8.0)"
RPROVIDES:mockito-junit-jupiter = "mockito-junit-jupiter ( =  5.8.0-6.el10) mvn(org.mockito:mockito-junit-jupiter) ( =  5.8.0) mvn(org.mockito:mockito-junit-jupiter:pom:) ( =  5.8.0)"
