
PN = "jaxb-dtd-parser"
PE = "0"
PV = "1.5.1"
PR = "6.el10"
PACKAGES = "jaxb-dtd-parser jaxb-dtd-parser-javadoc"


URI_jaxb-dtd-parser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-dtd-parser-1.5.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-dtd-parser = "javapackages-filesystem ( )"
RPROVIDES:jaxb-dtd-parser = "jaxb-dtd-parser ( =  1.5.1-6.el10) jpms(com.sun.xml.dtdparser) ( =  1.5.1) mvn(com.sun.xml.dtd-parser:dtd-parser) ( =  1.5.1) mvn(com.sun.xml.dtd-parser:dtd-parser:pom:) ( =  1.5.1) osgi(com.sun.xml.dtd-parser) ( =  1.5.1)"

URI_jaxb-dtd-parser-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-dtd-parser-javadoc-1.5.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-dtd-parser-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jaxb-dtd-parser-javadoc = "jaxb-dtd-parser-javadoc ( =  1.5.1-6.el10)"
