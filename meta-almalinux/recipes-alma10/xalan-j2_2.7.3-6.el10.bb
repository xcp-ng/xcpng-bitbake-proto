
PN = "xalan-j2"
PE = "0"
PV = "2.7.3"
PR = "6.el10"
PACKAGES = "xalan-j2 xalan-j2-manual xalan-j2-xsltc"


URI_xalan-j2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xalan-j2-2.7.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:xalan-j2 = "javapackages-filesystem ( ) xerces-j2 ( ) osgi(org.apache.xerces) ( )"
RPROVIDES:xalan-j2 = "jaxp_transform_impl ( ) mvn(xalan:serializer) ( =  2.7.3) mvn(xalan:serializer:pom:) ( =  2.7.3) mvn(xalan:xalan) ( =  2.7.3) mvn(xalan:xalan:pom:) ( =  2.7.3) osgi(org.apache.xalan) ( =  2.7.2) osgi(org.apache.xml.serializer) ( =  2.7.1) xalan-j2 ( =  2.7.3-6.el10)"

URI_xalan-j2-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xalan-j2-manual-2.7.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:xalan-j2-manual = ""
RPROVIDES:xalan-j2-manual = "xalan-j2-manual ( =  2.7.3-6.el10)"

URI_xalan-j2-xsltc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xalan-j2-xsltc-2.7.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:xalan-j2-xsltc = "javapackages-filesystem ( ) java_cup ( ) xerces-j2 ( ) bcel ( ) regexp ( ) mvn(xalan:xalan) ( =  2.7.3)"
RPROVIDES:xalan-j2-xsltc = "mvn(xalan:xsltc) ( =  2.7.3) mvn(xalan:xsltc:pom:) ( =  2.7.3) xalan-j2-xsltc ( =  2.7.3-6.el10)"
