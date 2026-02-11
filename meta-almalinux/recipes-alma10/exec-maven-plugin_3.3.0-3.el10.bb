
PN = "exec-maven-plugin"
PE = "0"
PV = "3.3.0"
PR = "3.el10"
PACKAGES = "exec-maven-plugin exec-maven-plugin-javadoc"


URI_exec-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exec-maven-plugin-3.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:exec-maven-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.apache.commons:commons-exec) ( ) mvn(org.apache.maven.resolver:maven-resolver-util) ( ) mvn(org.ow2.asm:asm-commons) ( )"
RPROVIDES:exec-maven-plugin = "exec-maven-plugin ( =  3.3.0-3.el10) maven-plugin-exec ( =  3.3.0-3.el10) mvn(org.codehaus.mojo:exec-maven-plugin) ( =  3.3.0) mvn(org.codehaus.mojo:exec-maven-plugin:pom:) ( =  3.3.0)"

URI_exec-maven-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exec-maven-plugin-javadoc-3.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:exec-maven-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:exec-maven-plugin-javadoc = "exec-maven-plugin-javadoc ( =  3.3.0-3.el10)"
