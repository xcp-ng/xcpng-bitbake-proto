
PN = "jakarta-mail"
PE = "0"
PV = "2.1.2"
PR = "6.el10"
PACKAGES = "jakarta-mail jakarta-mail-javadoc"


URI_jakarta-mail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-mail-2.1.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-mail = "javapackages-filesystem ( ) mvn(jakarta.activation:jakarta.activation-api) ( )"
RPROVIDES:jakarta-mail = "jakarta-mail ( =  2.1.2-6.el10) jpms(jakarta.mail) ( =  2.1.2) mvn(jakarta.mail:jakarta.mail-api) ( =  2.1.2) mvn(jakarta.mail:jakarta.mail-api:pom:) ( =  2.1.2) osgi(jakarta.mail-api) ( =  2.1.2)"

URI_jakarta-mail-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-mail-javadoc-2.1.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-mail-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jakarta-mail-javadoc = "jakarta-mail-javadoc ( =  2.1.2-6.el10)"
