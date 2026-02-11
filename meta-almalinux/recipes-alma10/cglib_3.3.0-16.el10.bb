
PN = "cglib"
PE = "0"
PV = "3.3.0"
PR = "16.el10"
PACKAGES = "cglib cglib-javadoc"


URI_cglib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cglib-3.3.0-16.el10.noarch.rpm;unpack=0"
RDEPENDS:cglib = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( )"
RPROVIDES:cglib = "cglib ( =  3.3.0-16.el10) mvn(cglib:cglib) ( =  3.3.0) mvn(cglib:cglib-full) ( =  3.3.0) mvn(cglib:cglib-full:pom:) ( =  3.3.0) mvn(cglib:cglib-nodep) ( =  3.3.0) mvn(cglib:cglib-nodep:pom:) ( =  3.3.0) mvn(cglib:cglib-parent:pom:) ( =  3.3.0) mvn(cglib:cglib-sample) ( =  3.3.0) mvn(cglib:cglib-sample:pom:) ( =  3.3.0) mvn(cglib:cglib:pom:) ( =  3.3.0) mvn(net.sf.cglib:cglib) ( =  3.3.0) mvn(net.sf.cglib:cglib:pom:) ( =  3.3.0) mvn(org.sonatype.sisu.inject:cglib) ( =  3.3.0) mvn(org.sonatype.sisu.inject:cglib:pom:) ( =  3.3.0) osgi(net.sf.cglib.core) ( =  3.3.0)"

URI_cglib-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cglib-javadoc-3.3.0-16.el10.noarch.rpm;unpack=0"
RDEPENDS:cglib-javadoc = "javapackages-filesystem ( )"
RPROVIDES:cglib-javadoc = "cglib-javadoc ( =  3.3.0-16.el10)"
