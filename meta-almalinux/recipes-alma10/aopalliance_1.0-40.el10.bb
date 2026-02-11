
PN = "aopalliance"
PE = "0"
PV = "1.0"
PR = "40.el10"
PACKAGES = "aopalliance aopalliance-javadoc"


URI_aopalliance = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aopalliance-1.0-40.el10.noarch.rpm;unpack=0"
RDEPENDS:aopalliance = "javapackages-filesystem ( )"
RPROVIDES:aopalliance = "aopalliance ( =  1.0-40.el10) mvn(aopalliance:aopalliance) ( =  1.0) mvn(aopalliance:aopalliance:pom:) ( =  1.0) osgi(aopalliance) ( =  1.0)"

URI_aopalliance-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aopalliance-javadoc-1.0-40.el10.noarch.rpm;unpack=0"
RDEPENDS:aopalliance-javadoc = "javapackages-filesystem ( )"
RPROVIDES:aopalliance-javadoc = "aopalliance-javadoc ( =  1.0-40.el10)"
