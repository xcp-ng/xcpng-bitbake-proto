
PN = "jctools"
PE = "0"
PV = "4.0.2"
PR = "4.el10"
PACKAGES = "jctools jctools-javadoc"


URI_jctools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jctools-4.0.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:jctools = "javapackages-filesystem ( )"
RPROVIDES:jctools = "jctools ( =  4.0.2-4.el10) jpms(org.jctools.core) ( =  4.0.2) mvn(org.jctools:jctools-core) ( =  4.0.2) mvn(org.jctools:jctools-core:pom:) ( =  4.0.2) osgi(org.jctools.core) ( =  4.0.2)"

URI_jctools-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jctools-javadoc-4.0.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:jctools-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jctools-javadoc = "jctools-javadoc ( =  4.0.2-4.el10)"
