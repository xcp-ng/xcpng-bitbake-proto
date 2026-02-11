
PN = "maven-antrun-plugin"
PE = "0"
PV = "3.1.0"
PR = "10.el10"
PACKAGES = "maven-antrun-plugin maven-antrun-plugin-javadoc"


URI_maven-antrun-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-antrun-plugin-3.1.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-antrun-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.ant:ant) ( )"
RPROVIDES:maven-antrun-plugin = "maven-antrun-plugin ( =  3.1.0-10.el10) mvn(org.apache.maven.plugins:maven-antrun-plugin) ( =  3.1.0) mvn(org.apache.maven.plugins:maven-antrun-plugin:pom:) ( =  3.1.0)"

URI_maven-antrun-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-antrun-plugin-javadoc-3.1.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-antrun-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-antrun-plugin-javadoc = "maven-antrun-plugin-javadoc ( =  3.1.0-10.el10)"
