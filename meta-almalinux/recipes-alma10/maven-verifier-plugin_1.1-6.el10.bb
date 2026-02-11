
PN = "maven-verifier-plugin"
PE = "0"
PV = "1.1"
PR = "6.el10"
PACKAGES = "maven-verifier-plugin maven-verifier-plugin-javadoc"


URI_maven-verifier-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-verifier-plugin-1.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-verifier-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) java-headless ( or  (REL))"
RPROVIDES:maven-verifier-plugin = "maven-verifier-plugin ( =  1.1-6.el10) mvn(org.apache.maven.plugins:maven-verifier-plugin) ( =  1.1) mvn(org.apache.maven.plugins:maven-verifier-plugin:pom:) ( =  1.1)"

URI_maven-verifier-plugin-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-verifier-plugin-javadoc-1.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-verifier-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-verifier-plugin-javadoc = "maven-verifier-plugin-javadoc ( =  1.1-6.el10)"
