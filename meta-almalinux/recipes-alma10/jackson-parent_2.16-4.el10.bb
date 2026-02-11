
PN = "jackson-parent"
PE = "0"
PV = "2.16"
PR = "4.el10"
PACKAGES = "jackson-parent"


URI_jackson-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-parent-2.16-4.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-parent = "javapackages-filesystem ( ) mvn(com.fasterxml:oss-parent:pom:) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-parent = "jackson-parent ( =  2.16-4.el10) mvn(com.fasterxml.jackson:jackson-parent:pom:) ( =  2.16)"
