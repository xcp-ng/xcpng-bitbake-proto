
PN = "bcel"
PE = "0"
PV = "6.8.1"
PR = "4.el10"
PACKAGES = "bcel bcel-javadoc"


URI_bcel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bcel-6.8.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:bcel = "javapackages-filesystem ( ) mvn(org.apache.commons:commons-lang3) ( )"
RPROVIDES:bcel = "jpms(org.apache.bcel) ( ) jpms(org.apache.bcel) ( =  6.8.1) bcel ( =  6.8.1-4.el10) mvn(apache:bcel) ( =  6.8.1) mvn(apache:bcel:pom:) ( =  6.8.1) mvn(bcel:bcel) ( =  6.8.1) mvn(bcel:bcel:pom:) ( =  6.8.1) mvn(org.apache.bcel:bcel) ( =  6.8.1) mvn(org.apache.bcel:bcel:pom:) ( =  6.8.1) osgi(org.apache.bcel) ( =  6.8.1)"

URI_bcel-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bcel-javadoc-6.8.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:bcel-javadoc = "javapackages-filesystem ( )"
RPROVIDES:bcel-javadoc = "bcel-javadoc ( =  6.8.1-4.el10)"
