
PN = "jboss-parent"
PE = "0"
PV = "20"
PR = "21.el10"
PACKAGES = "jboss-parent"


URI_jboss-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-parent-20-21.el10.noarch.rpm;unpack=0"
RDEPENDS:jboss-parent = "javapackages-filesystem ( ) mvn(org.apache.maven.plugins:maven-source-plugin) ( ) java-headless ( or  (REL))"
RPROVIDES:jboss-parent = "jboss-parent ( =  20-21.el10) mvn(org.jboss:jboss-parent:pom:) ( =  20)"
