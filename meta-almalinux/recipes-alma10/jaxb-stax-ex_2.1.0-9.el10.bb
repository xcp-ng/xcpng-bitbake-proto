
PN = "jaxb-stax-ex"
PE = "0"
PV = "2.1.0"
PR = "9.el10"
PACKAGES = "jaxb-stax-ex jaxb-stax-ex-javadoc"


URI_jaxb-stax-ex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-stax-ex-2.1.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-stax-ex = "javapackages-filesystem ( ) mvn(jakarta.activation:jakarta.activation-api) ( )"
RPROVIDES:jaxb-stax-ex = "jaxb-stax-ex ( =  2.1.0-9.el10) jpms(org.jvnet.staxex) ( =  2.1.0) mvn(org.jvnet.staxex:stax-ex) ( =  2.1.0) mvn(org.jvnet.staxex:stax-ex:pom:) ( =  2.1.0) osgi(org.jvnet.staxex.stax-ex) ( =  2.1.0)"

URI_jaxb-stax-ex-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-stax-ex-javadoc-2.1.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-stax-ex-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jaxb-stax-ex-javadoc = "jaxb-stax-ex-javadoc ( =  2.1.0-9.el10)"
