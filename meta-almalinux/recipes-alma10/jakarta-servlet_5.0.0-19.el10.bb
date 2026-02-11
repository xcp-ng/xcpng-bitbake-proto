
PN = "jakarta-servlet"
PE = "0"
PV = "5.0.0"
PR = "19.el10"
PACKAGES = "jakarta-servlet jakarta-servlet-javadoc"


URI_jakarta-servlet = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-servlet-5.0.0-19.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-servlet = "javapackages-filesystem ( )"
RPROVIDES:jakarta-servlet = "jpms(jakarta.servlet) ( ) glassfish-servlet-api ( =  5.0.0-19.el10) jakarta-servlet ( =  5.0.0-19.el10) mvn(jakarta.servlet:jakarta.servlet-api) ( =  5.0.0) mvn(jakarta.servlet:jakarta.servlet-api:pom:) ( =  5.0.0) mvn(javax.servlet:javax.servlet-api) ( =  5.0.0) mvn(javax.servlet:javax.servlet-api:pom:) ( =  5.0.0) mvn(javax.servlet:servlet-api) ( =  5.0.0) mvn(javax.servlet:servlet-api:pom:) ( =  5.0.0) osgi(jakarta.servlet-api) ( =  5.0.0)"

URI_jakarta-servlet-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-servlet-javadoc-5.0.0-19.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-servlet-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jakarta-servlet-javadoc = "jakarta-servlet-javadoc ( =  5.0.0-19.el10)"
