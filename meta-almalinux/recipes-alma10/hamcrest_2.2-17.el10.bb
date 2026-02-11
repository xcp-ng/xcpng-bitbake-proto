
PN = "hamcrest"
PE = "0"
PV = "2.2"
PR = "17.el10"
PACKAGES = "hamcrest hamcrest-javadoc"


URI_hamcrest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hamcrest-2.2-17.el10.noarch.rpm;unpack=0"
RDEPENDS:hamcrest = "javapackages-filesystem ( )"
RPROVIDES:hamcrest = "jpms(org.hamcrest) ( ) hamcrest ( =  2.2-17.el10) mvn(org.hamcrest:hamcrest) ( =  2.2) mvn(org.hamcrest:hamcrest-all) ( =  2.2) mvn(org.hamcrest:hamcrest-all:pom:) ( =  2.2) mvn(org.hamcrest:hamcrest-core) ( =  2.2) mvn(org.hamcrest:hamcrest-core:pom:) ( =  2.2) mvn(org.hamcrest:hamcrest-library) ( =  2.2) mvn(org.hamcrest:hamcrest-library:pom:) ( =  2.2) mvn(org.hamcrest:hamcrest:pom:) ( =  2.2)"

URI_hamcrest-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/hamcrest-javadoc-2.2-17.el10.noarch.rpm;unpack=0"
RDEPENDS:hamcrest-javadoc = "javapackages-filesystem ( )"
RPROVIDES:hamcrest-javadoc = "hamcrest-javadoc ( =  2.2-17.el10)"
