
PN = "jackson-core"
PE = "0"
PV = "2.16.1"
PR = "4.el10"
PACKAGES = "jackson-core"


URI_jackson-core = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-core-2.16.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-core = "javapackages-filesystem ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-core = "osgi(com.fasterxml.jackson.core.jackson-core) ( =  2.16.1) jackson-core ( =  2.16.1-4.el10) mvn(com.fasterxml.jackson.core:jackson-core) ( =  2.16.1) mvn(com.fasterxml.jackson.core:jackson-core:pom:) ( =  2.16.1)"
