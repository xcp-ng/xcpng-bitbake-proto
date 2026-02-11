
PN = "jaxb-api"
PE = "0"
PV = "4.0.1"
PR = "6.el10"
PACKAGES = "jaxb-api jaxb-api-javadoc"


URI_jaxb-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-api-4.0.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-api = "javapackages-filesystem ( ) mvn(jakarta.activation:jakarta.activation-api) ( )"
RPROVIDES:jaxb-api = "osgi(jakarta.xml.bind-api) ( =  4.0.1) jaxb-api ( =  4.0.1-6.el10) jpms(jakarta.xml.bind) ( =  4.0.1) mvn(jakarta.xml.bind:jakarta.xml.bind-api) ( =  4.0.1) mvn(jakarta.xml.bind:jakarta.xml.bind-api-parent:pom:) ( =  4.0.1) mvn(jakarta.xml.bind:jakarta.xml.bind-api:pom:) ( =  4.0.1)"

URI_jaxb-api-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-api-javadoc-4.0.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-api-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jaxb-api-javadoc = "jaxb-api-javadoc ( =  4.0.1-6.el10)"
