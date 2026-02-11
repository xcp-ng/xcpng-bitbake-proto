
PN = "xml-commons-apis"
PE = "0"
PV = "1.4.01"
PR = "47.el10"
PACKAGES = "xml-commons-apis xml-commons-apis-javadoc xml-commons-apis-manual"


URI_xml-commons-apis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xml-commons-apis-1.4.01-47.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-apis = "javapackages-filesystem ( )"
RPROVIDES:xml-commons-apis = "mvn(xerces:dom3-xml-apis) ( =  1.3.04) mvn(xerces:dom3-xml-apis:pom:) ( =  1.3.04) mvn(xml-apis:xml-apis) ( =  2.0.2) mvn(xml-apis:xml-apis-ext) ( =  1.3.04) mvn(xml-apis:xml-apis-ext:pom:) ( =  1.3.04) mvn(xml-apis:xml-apis:pom:) ( =  2.0.2) osgi(javax.xml) ( =  1.3.4) osgi(org.w3c.dom.svg) ( =  1.1.0) xml-commons ( =  1.4.01-47.el10) xml-commons-apis ( =  1.4.01-47.el10)"

URI_xml-commons-apis-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xml-commons-apis-javadoc-1.4.01-47.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-apis-javadoc = "javapackages-filesystem ( )"
RPROVIDES:xml-commons-apis-javadoc = "xml-commons-apis-javadoc ( =  1.4.01-47.el10)"

URI_xml-commons-apis-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xml-commons-apis-manual-1.4.01-47.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-apis-manual = ""
RPROVIDES:xml-commons-apis-manual = "xml-commons-apis-manual ( =  1.4.01-47.el10)"
