
PN = "apache-commons-jxpath"
PE = "0"
PV = "1.3"
PR = "53.el10"
PACKAGES = "apache-commons-jxpath apache-commons-jxpath-javadoc"


URI_apache-commons-jxpath = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-jxpath-1.3-53.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-jxpath = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-jxpath = "apache-commons-jxpath ( =  1.3-53.el10) jpms(org.apache.commons.jxpath) ( =  1.3) mvn(commons-jxpath:commons-jxpath) ( =  1.3) mvn(commons-jxpath:commons-jxpath:pom:) ( =  1.3) mvn(org.apache.commons:commons-jxpath) ( =  1.3) mvn(org.apache.commons:commons-jxpath:pom:) ( =  1.3) osgi(org.apache.commons.jxpath) ( =  1.3.0)"

URI_apache-commons-jxpath-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-jxpath-javadoc-1.3-53.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-jxpath-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-jxpath-javadoc = "apache-commons-jxpath-javadoc ( =  1.3-53.el10)"
