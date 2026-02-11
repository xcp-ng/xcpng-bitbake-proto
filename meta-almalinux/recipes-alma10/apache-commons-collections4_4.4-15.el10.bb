
PN = "apache-commons-collections4"
PE = "0"
PV = "4.4"
PR = "15.el10"
PACKAGES = "apache-commons-collections4 apache-commons-collections4-javadoc"


URI_apache-commons-collections4 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-commons-collections4-4.4-15.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-collections4 = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-collections4 = "jpms(org.apache.commons.collections4) ( ) apache-commons-collections4 ( =  4.4-15.el10) jpms(org.apache.commons.collections4) ( =  4.4) mvn(org.apache.commons:commons-collections4) ( =  4.4) mvn(org.apache.commons:commons-collections4:pom:) ( =  4.4) osgi(org.apache.commons.collections4) ( =  4.4.0)"

URI_apache-commons-collections4-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-commons-collections4-javadoc-4.4-15.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-collections4-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-collections4-javadoc = "apache-commons-collections4-javadoc ( =  4.4-15.el10)"
