
PN = "xerces-j2"
PE = "0"
PV = "2.12.2"
PR = "14.el10"
PACKAGES = "xerces-j2 xerces-j2-demo xerces-j2-javadoc"


URI_xerces-j2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xerces-j2-2.12.2-14.el10.noarch.rpm;unpack=0"
RDEPENDS:xerces-j2 = "/usr/bin/bash ( ) javapackages-filesystem ( ) javapackages-tools ( ) mvn(xml-apis:xml-apis) ( ) xml-commons-apis ( >=  1.4.01) xml-commons-resolver ( >=  1.2)"
RPROVIDES:xerces-j2 = "jpms(org.apache.xerces) ( ) jaxp_parser_impl ( =  1.4) mvn(apache:xerces-j2) ( =  2.11.0) mvn(apache:xerces-j2:pom:) ( =  2.11.0) mvn(xerces:xerces) ( =  2.11.0) mvn(xerces:xerces:pom:) ( =  2.11.0) mvn(xerces:xercesImpl) ( =  2.11.0) mvn(xerces:xercesImpl:pom:) ( =  2.11.0) mvn(xerces:xmlParserAPIs) ( =  2.11.0) mvn(xerces:xmlParserAPIs:pom:) ( =  2.11.0) osgi(org.apache.xerces) ( =  2.12.2) xerces-j2 ( =  2.12.2-14.el10) xerces-j2-scripts ( =  2.12.2-14.el10)"

URI_xerces-j2-demo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xerces-j2-demo-2.12.2-14.el10.noarch.rpm;unpack=0"
RDEPENDS:xerces-j2-demo = "xerces-j2 ( =  2.12.2-14.el10)"
RPROVIDES:xerces-j2-demo = "xerces-j2-demo ( =  2.12.2-14.el10)"

URI_xerces-j2-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xerces-j2-javadoc-2.12.2-14.el10.noarch.rpm;unpack=0"
RDEPENDS:xerces-j2-javadoc = "javapackages-filesystem ( )"
RPROVIDES:xerces-j2-javadoc = "xerces-j2-javadoc ( =  2.12.2-14.el10)"
