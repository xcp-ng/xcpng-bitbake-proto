
PN = "univocity-parsers"
PE = "0"
PV = "2.9.1"
PR = "14.el10"
PACKAGES = "univocity-parsers univocity-parsers-javadoc"


URI_univocity-parsers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/univocity-parsers-2.9.1-14.el10.noarch.rpm;unpack=0"
RDEPENDS:univocity-parsers = "javapackages-filesystem ( )"
RPROVIDES:univocity-parsers = "mvn(com.univocity:univocity-parsers) ( =  2.9.1) mvn(com.univocity:univocity-parsers:pom:) ( =  2.9.1) osgi(com.univocity.parsers) ( =  2.9.1) univocity-parsers ( =  2.9.1-14.el10)"

URI_univocity-parsers-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/univocity-parsers-javadoc-2.9.1-14.el10.noarch.rpm;unpack=0"
RDEPENDS:univocity-parsers-javadoc = "javapackages-filesystem ( )"
RPROVIDES:univocity-parsers-javadoc = "univocity-parsers-javadoc ( =  2.9.1-14.el10)"
