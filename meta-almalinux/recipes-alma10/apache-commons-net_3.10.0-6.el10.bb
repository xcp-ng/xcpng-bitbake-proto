
PN = "apache-commons-net"
PE = "0"
PV = "3.10.0"
PR = "6.el10"
PACKAGES = "apache-commons-net apache-commons-net-javadoc"


URI_apache-commons-net = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-net-3.10.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-net = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-net = "jpms(org.apache.commons.net) ( ) apache-commons-net ( =  3.10.0-6.el10) jpms(org.apache.commons.net) ( =  3.10.0) mvn(commons-net:commons-net) ( =  3.10.0) mvn(commons-net:commons-net:pom:) ( =  3.10.0) mvn(org.apache.commons:commons-net) ( =  3.10.0) mvn(org.apache.commons:commons-net:pom:) ( =  3.10.0) osgi(org.apache.commons.net) ( =  3.10.0)"

URI_apache-commons-net-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-net-javadoc-3.10.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-net-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-net-javadoc = "apache-commons-net-javadoc ( =  3.10.0-6.el10)"
