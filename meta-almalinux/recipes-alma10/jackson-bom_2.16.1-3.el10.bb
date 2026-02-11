
PN = "jackson-bom"
PE = "0"
PV = "2.16.1"
PR = "3.el10"
PACKAGES = "jackson-bom"


URI_jackson-bom = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-bom-2.16.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-bom = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson:jackson-parent:pom:) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-bom = "jackson-bom ( =  2.16.1-3.el10) mvn(com.fasterxml.jackson:jackson-base:pom:) ( =  2.16.1) mvn(com.fasterxml.jackson:jackson-bom:pom:) ( =  2.16.1)"
