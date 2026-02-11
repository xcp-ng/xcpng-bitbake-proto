
PN = "apache-commons-lang3"
PE = "0"
PV = "3.14.0"
PR = "6.el10"
PACKAGES = "apache-commons-lang3 apache-commons-lang3-javadoc"


URI_apache-commons-lang3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-lang3-3.14.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-lang3 = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-lang3 = "jpms(org.apache.commons.lang3) ( ) jpms(org.apache.commons.lang3) ( =  3.14.0) apache-commons-lang3 ( =  3.14.0-6.el10) mvn(org.apache.commons:commons-lang3) ( =  3.14.0) mvn(org.apache.commons:commons-lang3:pom:) ( =  3.14.0) osgi(org.apache.commons.lang3) ( =  3.14.0)"

URI_apache-commons-lang3-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-lang3-javadoc-3.14.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-lang3-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-lang3-javadoc = "apache-commons-lang3-javadoc ( =  3.14.0-6.el10)"
