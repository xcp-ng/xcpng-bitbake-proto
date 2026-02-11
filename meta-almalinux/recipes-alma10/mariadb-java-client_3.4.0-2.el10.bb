
PN = "mariadb-java-client"
PE = "0"
PV = "3.4.0"
PR = "2.el10"
PACKAGES = "mariadb-java-client mariadb-java-client-javadoc"


URI_mariadb-java-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-java-client-3.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mariadb-java-client = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(net.java.dev.jna:jna) ( ) mvn(net.java.dev.jna:jna-platform) ( )"
RPROVIDES:mariadb-java-client = "jpms(org.mariadb.jdbc) ( =  3.4.0) mariadb-java-client ( =  3.4.0-2.el10) mvn(mariadb:mariadb-connector-java) ( =  3.4.0) mvn(mariadb:mariadb-connector-java:pom:) ( =  3.4.0) mvn(org.mariadb.jdbc:mariadb-java-client) ( =  3.4.0) mvn(org.mariadb.jdbc:mariadb-java-client:pom:) ( =  3.4.0)"

URI_mariadb-java-client-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mariadb-java-client-javadoc-3.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mariadb-java-client-javadoc = "javapackages-filesystem ( )"
RPROVIDES:mariadb-java-client-javadoc = "mariadb-java-client-javadoc ( =  3.4.0-2.el10)"
