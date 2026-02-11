
PN = "jdependency"
PE = "0"
PV = "2.8.0"
PR = "7.el10"
PACKAGES = "jdependency jdependency-javadoc"


URI_jdependency = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jdependency-2.8.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jdependency = "javapackages-filesystem ( ) mvn(commons-io:commons-io) ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.ow2.asm:asm-commons) ( ) mvn(org.ow2.asm:asm-analysis) ( ) mvn(org.ow2.asm:asm-tree) ( ) mvn(org.ow2.asm:asm-util) ( ) java-headless ( or  (REL))"
RPROVIDES:jdependency = "jdependency ( =  2.8.0-7.el10) mvn(org.vafer:jdependency) ( =  2.8.0) mvn(org.vafer:jdependency:pom:) ( =  2.8.0)"

URI_jdependency-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jdependency-javadoc-2.8.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jdependency-javadoc = "javapackages-filesystem ( )"
RPROVIDES:jdependency-javadoc = "jdependency-javadoc ( =  2.8.0-7.el10)"
