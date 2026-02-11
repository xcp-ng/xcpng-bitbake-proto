
PN = "jakarta-annotations"
PE = "0"
PV = "1.3.5"
PR = "23.el10"
PACKAGES = "jakarta-annotations jakarta-annotations-javadoc"


URI_jakarta-annotations = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-annotations-1.3.5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-annotations = "javapackages-filesystem ( )"
RPROVIDES:jakarta-annotations = "jpms(java.annotation) ( ) osgi(jakarta.annotation-api) ( =  1.3.5) glassfish-annotation-api ( =  1.3.5-23.el10) jakarta-annotations ( =  1.3.5-23.el10) mvn(jakarta.annotation:ca-parent:pom:) ( =  1.3.5) mvn(jakarta.annotation:jakarta.annotation-api) ( =  1.3.5) mvn(jakarta.annotation:jakarta.annotation-api:pom:) ( =  1.3.5) mvn(javax.annotation:javax.annotation-api) ( =  1.3.5) mvn(javax.annotation:javax.annotation-api:pom:) ( =  1.3.5) mvn(javax.annotation:jsr250-api) ( =  1.3.5) mvn(javax.annotation:jsr250-api:pom:) ( =  1.3.5)"

URI_jakarta-annotations-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-annotations-javadoc-1.3.5-23.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-annotations-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jakarta-annotations-javadoc = "jakarta-annotations-javadoc ( =  1.3.5-23.el10)"
