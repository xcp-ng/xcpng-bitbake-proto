
PN = "jakarta-oro"
PE = "0"
PV = "2.0.8"
PR = "45.el10"
PACKAGES = "jakarta-oro jakarta-oro-javadoc"


URI_jakarta-oro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-oro-2.0.8-45.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-oro = "javapackages-filesystem ( )"
RPROVIDES:jakarta-oro = "deprecated() ( ) jakarta-oro ( =  2.0.8-45.el10) mvn(oro:oro) ( =  2.0.8) mvn(oro:oro:pom:) ( =  2.0.8) osgi(org.apache.oro) ( =  2.0.8)"

URI_jakarta-oro-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-oro-javadoc-2.0.8-45.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-oro-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jakarta-oro-javadoc = "deprecated() ( ) jakarta-oro-javadoc ( =  2.0.8-45.el10)"
