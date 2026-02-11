
PN = "msv"
PE = "0"
PV = "2022.7"
PR = "6.el10"
PACKAGES = "msv-javadoc msv-xsdlib"


URI_msv-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/msv-javadoc-2022.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:msv-javadoc = "javapackages-filesystem ( )"
RPROVIDES:msv-javadoc = "msv-javadoc ( =  2022.7-6.el10)"

URI_msv-xsdlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/msv-xsdlib-2022.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:msv-xsdlib = "javapackages-filesystem ( ) mvn(relaxngDatatype:relaxngDatatype) ( )"
RPROVIDES:msv-xsdlib = "msv-xsdlib ( =  2022.7-6.el10) mvn(net.java.dev.msv:xsdlib) ( =  2022.7) mvn(net.java.dev.msv:xsdlib:pom:) ( =  2022.7) osgi(xsdlib) ( =  2022.7)"
