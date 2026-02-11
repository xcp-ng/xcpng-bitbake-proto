
PN = "cdi-api"
PE = "0"
PV = "2.0.2"
PR = "15.el10"
PACKAGES = "cdi-api cdi-api-javadoc"


URI_cdi-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cdi-api-2.0.2-15.el10.noarch.rpm;unpack=0"
RDEPENDS:cdi-api = "javapackages-filesystem ( ) mvn(jakarta.inject:jakarta.inject-api) ( )"
RPROVIDES:cdi-api = "cdi-api ( =  2.0.2-15.el10) mvn(jakarta.enterprise:jakarta.enterprise.cdi-api) ( =  2.0.2) mvn(jakarta.enterprise:jakarta.enterprise.cdi-api:pom:) ( =  2.0.2) mvn(javax.enterprise:cdi-api) ( =  2.0.2) mvn(javax.enterprise:cdi-api:pom:) ( =  2.0.2) mvn(org.eclipse.ee4j.cdi:cdi-parent:pom:) ( =  2.0.2.SNAPSHOT) osgi(jakarta.enterprise.cdi-api) ( =  2.0.2)"

URI_cdi-api-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cdi-api-javadoc-2.0.2-15.el10.noarch.rpm;unpack=0"
RDEPENDS:cdi-api-javadoc = "javapackages-filesystem ( )"
RPROVIDES:cdi-api-javadoc = "cdi-api-javadoc ( =  2.0.2-15.el10)"
