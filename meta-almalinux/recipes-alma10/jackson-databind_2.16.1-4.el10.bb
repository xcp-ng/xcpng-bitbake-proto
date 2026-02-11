
PN = "jackson-databind"
PE = "0"
PV = "2.16.1"
PR = "4.el10"
PACKAGES = "jackson-databind"


URI_jackson-databind = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-databind-2.16.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-databind = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson.core:jackson-core) ( ) mvn(com.fasterxml.jackson.core:jackson-annotations) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-databind = "osgi(com.fasterxml.jackson.core.jackson-databind) ( =  2.16.1) jackson-databind ( =  2.16.1-4.el10) mvn(com.fasterxml.jackson.core:jackson-databind) ( =  2.16.1) mvn(com.fasterxml.jackson.core:jackson-databind:pom:) ( =  2.16.1)"
