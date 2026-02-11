
PN = "apache-parent"
PE = "0"
PV = "33"
PR = "1.el10"
PACKAGES = "apache-parent"


URI_apache-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-parent-33-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-parent = "javapackages-filesystem ( ) mvn(org.apache.maven.plugins:maven-enforcer-plugin) ( ) mvn(org.apache.maven.plugins:maven-remote-resources-plugin) ( ) mvn(org.apache.apache.resources:apache-jar-resource-bundle) ( )"
RPROVIDES:apache-parent = "apache-parent ( =  33-1.el10) mvn(org.apache:apache:pom:) ( =  33) mvn(org.apache:docs:pom:) ( =  33)"
