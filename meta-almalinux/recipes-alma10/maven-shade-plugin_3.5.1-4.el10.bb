
PN = "maven-shade-plugin"
PE = "0"
PV = "3.5.1"
PR = "4.el10"
PACKAGES = "maven-shade-plugin maven-shade-plugin-javadoc"


URI_maven-shade-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-shade-plugin-3.5.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shade-plugin = "javapackages-filesystem ( ) mvn(commons-io:commons-io) ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.commons:commons-collections4) ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.ow2.asm:asm-commons) ( ) mvn(org.vafer:jdependency) ( ) mvn(org.apache.maven.shared:maven-dependency-tree) ( ) mvn(org.jdom:jdom2) ( ) mvn(org.slf4j:slf4j-api) ( ) java-headless ( or  (REL))"
RPROVIDES:maven-shade-plugin = "maven-shade-plugin ( =  3.5.1-4.el10) mvn(org.apache.maven.plugins:maven-shade-plugin) ( =  3.5.1) mvn(org.apache.maven.plugins:maven-shade-plugin:pom:) ( =  3.5.1)"

URI_maven-shade-plugin-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-shade-plugin-javadoc-3.5.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-shade-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-shade-plugin-javadoc = "maven-shade-plugin-javadoc ( =  3.5.1-4.el10)"
