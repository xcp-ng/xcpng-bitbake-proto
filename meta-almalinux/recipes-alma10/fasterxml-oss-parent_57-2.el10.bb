
PN = "fasterxml-oss-parent"
PE = "0"
PV = "57"
PR = "2.el10"
PACKAGES = "fasterxml-oss-parent"


URI_fasterxml-oss-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fasterxml-oss-parent-57-2.el10.noarch.rpm;unpack=0"
RDEPENDS:fasterxml-oss-parent = "javapackages-filesystem ( ) mvn(org.apache.maven.plugins:maven-compiler-plugin) ( ) mvn(org.apache.felix:maven-bundle-plugin) ( ) mvn(org.apache.maven.plugins:maven-jar-plugin) ( ) mvn(org.apache.maven.plugins:maven-surefire-plugin) ( ) mvn(org.codehaus.mojo:build-helper-maven-plugin) ( ) java-headless ( or  (REL))"
RPROVIDES:fasterxml-oss-parent = "fasterxml-oss-parent ( =  57-2.el10) mvn(com.fasterxml:oss-parent:pom:) ( =  57)"
