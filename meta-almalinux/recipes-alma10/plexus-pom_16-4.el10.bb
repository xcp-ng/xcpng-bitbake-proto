
PN = "plexus-pom"
PE = "0"
PV = "16"
PR = "4.el10"
PACKAGES = "plexus-pom"


URI_plexus-pom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-pom-16-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-pom = "javapackages-filesystem ( )"
RPROVIDES:plexus-pom = "mvn(org.codehaus.plexus:plexus:pom:) ( =  16) plexus-pom ( =  16-4.el10)"
