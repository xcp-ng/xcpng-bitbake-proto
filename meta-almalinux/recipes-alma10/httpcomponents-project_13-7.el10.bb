
PN = "httpcomponents-project"
PE = "0"
PV = "13"
PR = "7.el10"
PACKAGES = "httpcomponents-project"


URI_httpcomponents-project = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/httpcomponents-project-13-7.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-project = "javapackages-filesystem ( ) mvn(org.apache:apache:pom:) ( ) mvn(org.apache.maven.plugins:maven-jar-plugin) ( )"
RPROVIDES:httpcomponents-project = "httpcomponents-project ( =  13-7.el10) mvn(org.apache.httpcomponents:httpcomponents-parent:pom:) ( =  13) mvn(org.apache.httpcomponents:project:pom:) ( =  13)"
