
PN = "xml-commons-resolver"
PE = "0"
PV = "1.2"
PR = "45.el10"
PACKAGES = "xml-commons-resolver xml-commons-resolver-javadoc"


URI_xml-commons-resolver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xml-commons-resolver-1.2-45.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-resolver = "/usr/bin/bash ( ) javapackages-filesystem ( ) javapackages-tools ( )"
RPROVIDES:xml-commons-resolver = "mvn(xml-resolver:xml-resolver) ( =  1.2) mvn(xml-resolver:xml-resolver:pom:) ( =  1.2) osgi(org.apache.xml.resolver) ( =  1.2.0) xml-commons-resolver ( =  1.2-45.el10)"

URI_xml-commons-resolver-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xml-commons-resolver-javadoc-1.2-45.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-resolver-javadoc = "javapackages-filesystem ( )"
RPROVIDES:xml-commons-resolver-javadoc = "xml-commons-resolver-javadoc ( =  1.2-45.el10)"
