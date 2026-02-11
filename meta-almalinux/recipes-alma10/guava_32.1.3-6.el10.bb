
PN = "guava"
PE = "0"
PV = "32.1.3"
PR = "6.el10"
PACKAGES = "guava guava-javadoc guava-testlib"


URI_guava = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/guava-32.1.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:guava = "javapackages-filesystem ( ) mvn(com.google.code.findbugs:jsr305) ( )"
RPROVIDES:guava = "jpms(com.google.common) ( ) guava ( =  32.1.3-6.el10) mvn(com.google.guava:failureaccess) ( =  1.0.1) mvn(com.google.guava:failureaccess:pom:) ( =  1.0.1) mvn(com.google.guava:guava) ( =  32.1.3.jre) mvn(com.google.guava:guava-parent:pom:) ( =  32.1.3.jre) mvn(com.google.guava:guava:pom:) ( =  32.1.3.jre) osgi(com.google.guava) ( =  32.1.3) osgi(com.google.guava.failureaccess) ( =  1.0.1)"

URI_guava-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guava-javadoc-32.1.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:guava-javadoc = "javapackages-filesystem ( )"
RPROVIDES:guava-javadoc = "guava-javadoc ( =  32.1.3-6.el10)"

URI_guava-testlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guava-testlib-32.1.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:guava-testlib = "javapackages-filesystem ( ) mvn(junit:junit) ( ) mvn(com.google.code.findbugs:jsr305) ( ) mvn(com.google.guava:guava) ( =  32.1.3.jre)"
RPROVIDES:guava-testlib = "guava-testlib ( =  32.1.3-6.el10) mvn(com.google.guava:guava-testlib) ( =  32.1.3.jre) mvn(com.google.guava:guava-testlib:pom:) ( =  32.1.3.jre)"
