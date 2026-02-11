
PN = "javaparser"
PE = "0"
PV = "3.25.6"
PR = "7.el10"
PACKAGES = "javaparser javaparser-javadoc"


URI_javaparser = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javaparser-3.25.6-7.el10.noarch.rpm;unpack=0"
RDEPENDS:javaparser = "javapackages-filesystem ( )"
RPROVIDES:javaparser = "jpms(com.github.javaparser.core) ( ) javaparser ( =  3.25.6-7.el10) mvn(com.github.javaparser:javaparser-core) ( =  3.25.6) mvn(com.github.javaparser:javaparser-core:pom:) ( =  3.25.6) mvn(com.github.javaparser:javaparser-parent:pom:) ( =  3.25.6) mvn(com.google.code.javaparser:javaparser) ( =  3.25.6) mvn(com.google.code.javaparser:javaparser:pom:) ( =  3.25.6)"

URI_javaparser-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javaparser-javadoc-3.25.6-7.el10.noarch.rpm;unpack=0"
RDEPENDS:javaparser-javadoc = "javapackages-filesystem ( )"
RPROVIDES:javaparser-javadoc = "javaparser-javadoc ( =  3.25.6-7.el10)"
