
PN = "moditect"
PE = "0"
PV = "1.1.0"
PR = "4.el10"
PACKAGES = "moditect moditect-javadoc"


URI_moditect = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/moditect-1.1.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:moditect = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.eclipse.aether:aether-util) ( ) mvn(com.beust:jcommander) ( ) mvn(com.github.javaparser:javaparser-core) ( )"
RPROVIDES:moditect = "moditect ( =  1.1.0-4.el10) mvn(org.moditect:moditect) ( =  1.1.0) mvn(org.moditect:moditect-aggregator:pom:) ( =  1.1.0) mvn(org.moditect:moditect-maven-plugin) ( =  1.1.0) mvn(org.moditect:moditect-maven-plugin:pom:) ( =  1.1.0) mvn(org.moditect:moditect-parent:pom:) ( =  1.1.0) mvn(org.moditect:moditect:pom:) ( =  1.1.0)"

URI_moditect-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/moditect-javadoc-1.1.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:moditect-javadoc = "javapackages-filesystem ( )"
RPROVIDES:moditect-javadoc = "moditect-javadoc ( =  1.1.0-4.el10)"
