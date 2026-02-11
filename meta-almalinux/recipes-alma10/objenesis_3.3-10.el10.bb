
PN = "objenesis"
PE = "0"
PV = "3.3"
PR = "10.el10"
PACKAGES = "objenesis objenesis-javadoc"


URI_objenesis = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/objenesis-3.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:objenesis = "javapackages-filesystem ( )"
RPROVIDES:objenesis = "jpms(org.objenesis) ( ) jpms(org.objenesis.exotic) ( ) jpms(org.objenesis.tck) ( ) jpms(org.objenesis.test) ( ) mvn(org.objenesis:objenesis) ( =  3.3) mvn(org.objenesis:objenesis-exotic) ( =  3.3) mvn(org.objenesis:objenesis-exotic:pom:) ( =  3.3) mvn(org.objenesis:objenesis-parent:pom:) ( =  3.3) mvn(org.objenesis:objenesis-tck) ( =  3.3) mvn(org.objenesis:objenesis-tck:pom:) ( =  3.3) mvn(org.objenesis:objenesis-test) ( =  3.3) mvn(org.objenesis:objenesis-test:pom:) ( =  3.3) mvn(org.objenesis:objenesis:pom:) ( =  3.3) objenesis ( =  3.3-10.el10) osgi(org.objenesis) ( =  3.3.0) osgi(org.objenesis.exotic) ( =  3.3.0) osgi(org.objenesis.test) ( =  3.3.0)"

URI_objenesis-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/objenesis-javadoc-3.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:objenesis-javadoc = "javapackages-filesystem ( )"
RPROVIDES:objenesis-javadoc = "objenesis-javadoc ( =  3.3-10.el10)"
