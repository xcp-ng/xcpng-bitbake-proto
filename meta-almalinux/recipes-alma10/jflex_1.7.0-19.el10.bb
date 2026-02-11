
PN = "jflex"
PE = "0"
PV = "1.7.0"
PR = "19.el10"
PACKAGES = "jflex jflex-javadoc"


URI_jflex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jflex-1.7.0-19.el10.noarch.rpm;unpack=0"
RDEPENDS:jflex = "javapackages-filesystem ( ) /usr/bin/bash ( ) javapackages-tools ( ) mvn(org.apache.ant:ant) ( ) mvn(java_cup:java_cup) ( )"
RPROVIDES:jflex = "jflex ( =  1.7.0-19.el10) mvn(de.jflex:jflex) ( =  1.7.0) mvn(de.jflex:jflex:pom:) ( =  1.7.0)"

URI_jflex-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jflex-javadoc-1.7.0-19.el10.noarch.rpm;unpack=0"
RDEPENDS:jflex-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jflex-javadoc = "jflex-javadoc ( =  1.7.0-19.el10)"
