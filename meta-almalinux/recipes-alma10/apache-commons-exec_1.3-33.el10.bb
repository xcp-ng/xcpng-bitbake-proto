
PN = "apache-commons-exec"
PE = "0"
PV = "1.3"
PR = "33.el10"
PACKAGES = "apache-commons-exec apache-commons-exec-javadoc"


URI_apache-commons-exec = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-exec-1.3-33.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-exec = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-exec = "apache-commons-exec ( =  1.3-33.el10) jpms(org.apache.commons.exec) ( =  1.3) mvn(org.apache.commons:commons-exec) ( =  1.3) mvn(org.apache.commons:commons-exec:pom:) ( =  1.3) osgi(org.apache.commons.exec) ( =  1.3.0)"

URI_apache-commons-exec-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-exec-javadoc-1.3-33.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-exec-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-exec-javadoc = "apache-commons-exec-javadoc ( =  1.3-33.el10)"
