
PN = "xmlunit"
PE = "0"
PV = "2.9.0"
PR = "10.el10"
PACKAGES = "xmlunit xmlunit-assertj xmlunit-core xmlunit-javadoc xmlunit-legacy xmlunit-matchers xmlunit-placeholders"


URI_xmlunit = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-2.9.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlunit = "javapackages-filesystem ( ) mvn(org.apache.felix:maven-bundle-plugin) ( )"
RPROVIDES:xmlunit = "mvn(org.xmlunit:xmlunit-parent:pom:) ( =  2.9.0) xmlunit ( =  2.9.0-10.el10)"

URI_xmlunit-assertj = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-assertj-2.9.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlunit-assertj = "javapackages-filesystem ( ) mvn(org.assertj:assertj-core) ( ) mvn(org.xmlunit:xmlunit-core) ( =  2.9.0)"
RPROVIDES:xmlunit-assertj = "jpms(org.xmlunit.assertj3) ( ) mvn(org.xmlunit:xmlunit-assertj) ( =  2.9.0) mvn(org.xmlunit:xmlunit-assertj3) ( =  2.9.0) mvn(org.xmlunit:xmlunit-assertj3:pom:) ( =  2.9.0) mvn(org.xmlunit:xmlunit-assertj:pom:) ( =  2.9.0) osgi(org.xmlunit.xmlunit-assertj3) ( =  2.9.0) xmlunit-assertj ( =  2.9.0-10.el10)"

URI_xmlunit-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-core-2.9.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlunit-core = "javapackages-filesystem ( )"
RPROVIDES:xmlunit-core = "jpms(org.xmlunit) ( ) mvn(org.xmlunit:xmlunit-core) ( =  2.9.0) mvn(org.xmlunit:xmlunit-core:pom:) ( =  2.9.0) osgi(org.xmlunit.xmlunit-core) ( =  2.9.0) xmlunit-core ( =  2.9.0-10.el10)"

URI_xmlunit-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-javadoc-2.9.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlunit-javadoc = "javapackages-filesystem ( )"
RPROVIDES:xmlunit-javadoc = "xmlunit-javadoc ( =  2.9.0-10.el10)"

URI_xmlunit-legacy = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-legacy-2.9.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlunit-legacy = "javapackages-filesystem ( ) mvn(junit:junit) ( ) mvn(org.xmlunit:xmlunit-core) ( =  2.9.0)"
RPROVIDES:xmlunit-legacy = "jpms(org.custommonkey.xmlunit) ( ) mvn(org.xmlunit:xmlunit-legacy) ( =  2.9.0) mvn(org.xmlunit:xmlunit-legacy:pom:) ( =  2.9.0) mvn(xmlunit:xmlunit) ( =  2.9.0) mvn(xmlunit:xmlunit:pom:) ( =  2.9.0) osgi(org.xmlunit.xmlunit-legacy) ( =  2.9.0) xmlunit-legacy ( =  2.9.0-10.el10)"

URI_xmlunit-matchers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-matchers-2.9.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlunit-matchers = "javapackages-filesystem ( ) mvn(org.hamcrest:hamcrest-core) ( ) mvn(org.xmlunit:xmlunit-core) ( =  2.9.0)"
RPROVIDES:xmlunit-matchers = "jpms(org.xmlunit.matchers) ( ) mvn(org.xmlunit:xmlunit-matchers) ( =  2.9.0) mvn(org.xmlunit:xmlunit-matchers:pom:) ( =  2.9.0) osgi(org.xmlunit.xmlunit-matchers) ( =  2.9.0) xmlunit-matchers ( =  2.9.0-10.el10)"

URI_xmlunit-placeholders = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-placeholders-2.9.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlunit-placeholders = "javapackages-filesystem ( ) mvn(org.xmlunit:xmlunit-core) ( =  2.9.0)"
RPROVIDES:xmlunit-placeholders = "jpms(org.xmlunit.placeholder) ( ) mvn(org.xmlunit:xmlunit-placeholders) ( =  2.9.0) mvn(org.xmlunit:xmlunit-placeholders:pom:) ( =  2.9.0) osgi(org.xmlunit.xmlunit-placeholders) ( =  2.9.0) xmlunit-placeholders ( =  2.9.0-10.el10)"
