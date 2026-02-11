
PN = "jaxb-fi"
PE = "0"
PV = "2.1.1"
PR = "7.el10"
PACKAGES = "jaxb-fi jaxb-fi-javadoc jaxb-fi-tests"


URI_jaxb-fi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-fi-2.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-fi = "javapackages-filesystem ( )"
RPROVIDES:jaxb-fi = "mvn(com.sun.xml.fastinfoset:FastInfoset) ( =  2.1.1) jaxb-fi ( =  2.1.1-7.el10) jpms(com.sun.xml.fastinfoset) ( =  2.1.1) mvn(com.sun.xml.fastinfoset:FastInfoset:pom:) ( =  2.1.1) mvn(com.sun.xml.fastinfoset:fastinfoset-project:pom:) ( =  2.1.1) osgi(com.sun.xml.fastinfoset.FastInfoset) ( =  2.1.1)"

URI_jaxb-fi-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-fi-javadoc-2.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-fi-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jaxb-fi-javadoc = "jaxb-fi-javadoc ( =  2.1.1-7.el10)"

URI_jaxb-fi-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-fi-tests-2.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-fi-tests = "javapackages-filesystem ( ) mvn(com.sun.xml.fastinfoset:FastInfoset) ( =  2.1.1)"
RPROVIDES:jaxb-fi-tests = "jaxb-fi-tests ( =  2.1.1-7.el10) jpms(com.sun.xml.fastinfoset.rtt) ( =  2.1.1) mvn(com.sun.xml.fastinfoset:FastInfosetRoundTripTests) ( =  2.1.1) mvn(com.sun.xml.fastinfoset:FastInfosetRoundTripTests:pom:) ( =  2.1.1)"
