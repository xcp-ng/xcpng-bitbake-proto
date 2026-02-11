
PN = "apache-commons-compress"
PE = "0"
PV = "1.27.1"
PR = "1.el10"
PACKAGES = "apache-commons-compress apache-commons-compress-javadoc"


URI_apache-commons-compress = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-compress-1.27.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-compress = "javapackages-filesystem ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(commons-codec:commons-codec) ( ) mvn(commons-io:commons-io) ( )"
RPROVIDES:apache-commons-compress = "jpms(org.apache.commons.compress) ( ) jpms(org.apache.commons.compress) ( =  1.27.1) apache-commons-compress ( =  1.27.1-1.el10) mvn(commons:commons-compress) ( =  1.27.1) mvn(commons:commons-compress:pom:) ( =  1.27.1) mvn(org.apache.commons:commons-compress) ( =  1.27.1) mvn(org.apache.commons:commons-compress:pom:) ( =  1.27.1) osgi(org.apache.commons.compress) ( =  1.27.1)"

URI_apache-commons-compress-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-compress-javadoc-1.27.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-compress-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-compress-javadoc = "apache-commons-compress-javadoc ( =  1.27.1-1.el10)"
