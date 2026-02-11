
PN = "apache-commons-parent"
PE = "0"
PV = "66"
PR = "4.el10"
PACKAGES = "apache-commons-parent"


URI_apache-commons-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-parent-66-4.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-parent = "javapackages-filesystem ( ) mvn(org.apache:apache:pom:) ( ) mvn(org.apache.felix:maven-bundle-plugin) ( ) mvn(org.apache.maven.plugins:maven-jar-plugin) ( ) mvn(org.apache.maven.plugins:maven-assembly-plugin) ( ) mvn(org.apache.maven.plugins:maven-compiler-plugin) ( ) mvn(org.apache.maven.plugins:maven-surefire-plugin) ( ) mvn(org.apache.maven.plugins:maven-antrun-plugin) ( ) mvn(org.codehaus.mojo:build-helper-maven-plugin) ( ) mvn(org.moditect:moditect-maven-plugin) ( )"
RPROVIDES:apache-commons-parent = "apache-commons-parent ( =  66-4.el10) mvn(org.apache.commons:commons-parent:pom:) ( =  66)"
