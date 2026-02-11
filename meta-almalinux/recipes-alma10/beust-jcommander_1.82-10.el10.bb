
PN = "beust-jcommander"
PE = "0"
PV = "1.82"
PR = "10.el10"
PACKAGES = "beust-jcommander beust-jcommander-javadoc"


URI_beust-jcommander = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/beust-jcommander-1.82-10.el10.noarch.rpm;unpack=0"
RDEPENDS:beust-jcommander = "javapackages-filesystem ( )"
RPROVIDES:beust-jcommander = "beust-jcommander ( =  1.82-10.el10) mvn(com.beust:jcommander) ( =  1.82) mvn(com.beust:jcommander:pom:) ( =  1.82)"

URI_beust-jcommander-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/beust-jcommander-javadoc-1.82-10.el10.noarch.rpm;unpack=0"
RDEPENDS:beust-jcommander-javadoc = "javapackages-filesystem ( )"
RPROVIDES:beust-jcommander-javadoc = "beust-jcommander-javadoc ( =  1.82-10.el10)"
