
PN = "maven-compiler-plugin"
PE = "0"
PV = "3.12.1"
PR = "4.el10"
PACKAGES = "maven-compiler-plugin maven-compiler-plugin-javadoc"


URI_maven-compiler-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-compiler-plugin-3.12.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-compiler-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.maven.shared:maven-shared-utils) ( ) mvn(org.codehaus.plexus:plexus-java) ( ) mvn(org.apache.maven.shared:maven-shared-incremental) ( ) mvn(org.codehaus.plexus:plexus-compiler-api) ( ) mvn(org.codehaus.plexus:plexus-compiler-javac) ( ) mvn(org.codehaus.plexus:plexus-compiler-manager) ( )"
RPROVIDES:maven-compiler-plugin = "maven-compiler-plugin ( =  3.12.1-4.el10) mvn(org.apache.maven.plugins:maven-compiler-plugin) ( =  3.12.1) mvn(org.apache.maven.plugins:maven-compiler-plugin:pom:) ( =  3.12.1)"

URI_maven-compiler-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-compiler-plugin-javadoc-3.12.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-compiler-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-compiler-plugin-javadoc = "maven-compiler-plugin-javadoc ( =  3.12.1-4.el10)"
