
PN = "apiguardian"
PE = "0"
PV = "1.1.2"
PR = "13.el10"
PACKAGES = "apiguardian apiguardian-javadoc"


URI_apiguardian = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apiguardian-1.1.2-13.el10.noarch.rpm;unpack=0"
RDEPENDS:apiguardian = "javapackages-filesystem ( )"
RPROVIDES:apiguardian = "apiguardian ( =  1.1.2-13.el10) jpms(org.apiguardian.api) ( =  1.1.2) mvn(org.apiguardian:apiguardian-api) ( =  1.1.2) mvn(org.apiguardian:apiguardian-api:pom:) ( =  1.1.2) osgi(org.apiguardian) ( =  1.1.2)"

URI_apiguardian-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apiguardian-javadoc-1.1.2-13.el10.noarch.rpm;unpack=0"
RDEPENDS:apiguardian-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apiguardian-javadoc = "apiguardian-javadoc ( =  1.1.2-13.el10)"
