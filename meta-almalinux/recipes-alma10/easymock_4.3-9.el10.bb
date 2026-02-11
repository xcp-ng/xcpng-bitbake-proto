
PN = "easymock"
PE = "0"
PV = "4.3"
PR = "9.el10"
PACKAGES = "easymock easymock-javadoc"


URI_easymock = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/easymock-4.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:easymock = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.objenesis:objenesis) ( ) mvn(cglib:cglib) ( )"
RPROVIDES:easymock = "jpms(org.easymock) ( ) easymock ( =  4.3-9.el10) easymock3 ( =  4.3-9.el10) mvn(org.easymock:easymock) ( =  4.3) mvn(org.easymock:easymock-parent:pom:) ( =  4.3) mvn(org.easymock:easymock-test-java8) ( =  4.3) mvn(org.easymock:easymock-test-java8:pom:) ( =  4.3) mvn(org.easymock:easymock-test-junit5) ( =  4.3) mvn(org.easymock:easymock-test-junit5:pom:) ( =  4.3) mvn(org.easymock:easymock-test-testng) ( =  4.3) mvn(org.easymock:easymock-test-testng:pom:) ( =  4.3) mvn(org.easymock:easymock:pom:) ( =  4.3) osgi(org.easymock) ( =  4.3.0)"

URI_easymock-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/easymock-javadoc-4.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:easymock-javadoc = "javapackages-filesystem ( )"
RPROVIDES:easymock-javadoc = "easymock-javadoc ( =  4.3-9.el10)"
