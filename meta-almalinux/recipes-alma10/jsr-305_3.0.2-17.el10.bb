
PN = "jsr-305"
PE = "0"
PV = "3.0.2"
PR = "17.el10"
PACKAGES = "jsr-305 jsr-305-javadoc"


URI_jsr-305 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jsr-305-3.0.2-17.el10.noarch.rpm;unpack=0"
RDEPENDS:jsr-305 = "javapackages-filesystem ( )"
RPROVIDES:jsr-305 = "jsr-305 ( =  3.0.2-17.el10) mvn(com.google.code.findbugs:jsr305) ( =  3.0.2) mvn(com.google.code.findbugs:jsr305:pom:) ( =  3.0.2) mvn(org.jsr-305:jsr-305:pom:) ( =  0.1.SNAPSHOT) mvn(org.jsr-305:ri) ( =  3.0.2) mvn(org.jsr-305:ri:pom:) ( =  3.0.2) osgi(org.jsr-305) ( =  3.0.2)"

URI_jsr-305-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jsr-305-javadoc-3.0.2-17.el10.noarch.rpm;unpack=0"
RDEPENDS:jsr-305-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jsr-305-javadoc = "jsr-305-javadoc ( =  3.0.2-17.el10)"
