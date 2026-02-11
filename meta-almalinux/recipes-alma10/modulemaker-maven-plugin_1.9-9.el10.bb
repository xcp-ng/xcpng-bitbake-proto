
PN = "modulemaker-maven-plugin"
PE = "0"
PV = "1.9"
PR = "9.el10"
PACKAGES = "modulemaker-maven-plugin modulemaker-maven-plugin-javadoc"


URI_modulemaker-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/modulemaker-maven-plugin-1.9-9.el10.noarch.rpm;unpack=0"
RDEPENDS:modulemaker-maven-plugin = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( )"
RPROVIDES:modulemaker-maven-plugin = "modulemaker-maven-plugin ( =  1.9-9.el10) mvn(codes.rafael.modulemaker:modulemaker-maven-plugin) ( =  1.9) mvn(codes.rafael.modulemaker:modulemaker-maven-plugin:pom:) ( =  1.9)"

URI_modulemaker-maven-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/modulemaker-maven-plugin-javadoc-1.9-9.el10.noarch.rpm;unpack=0"
RDEPENDS:modulemaker-maven-plugin-javadoc = "javapackages-filesystem ( )"
RPROVIDES:modulemaker-maven-plugin-javadoc = "modulemaker-maven-plugin-javadoc ( =  1.9-9.el10)"
