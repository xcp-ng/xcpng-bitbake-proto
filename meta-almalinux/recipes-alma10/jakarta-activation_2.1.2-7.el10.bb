
PN = "jakarta-activation"
PE = "0"
PV = "2.1.2"
PR = "7.el10"
PACKAGES = "jakarta-activation jakarta-activation-javadoc"


URI_jakarta-activation = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-activation-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-activation = "javapackages-filesystem ( )"
RPROVIDES:jakarta-activation = "osgi(jakarta.activation-api) ( =  2.1.2) jakarta-activation ( =  2.1.2-7.el10) jpms(jakarta.activation) ( =  2.1.2) mvn(jakarta.activation:jakarta.activation-api) ( =  2.1.2) mvn(jakarta.activation:jakarta.activation-api:pom:) ( =  2.1.2)"

URI_jakarta-activation-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-activation-javadoc-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-activation-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jakarta-activation-javadoc = "jakarta-activation-javadoc ( =  2.1.2-7.el10)"
