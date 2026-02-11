
PN = "xmvn-generator"
PE = "0"
PV = "1.2.2"
PR = "8.el10"
PACKAGES = "xmvn-generator xmvn-generator-javadoc"


URI_xmvn-generator = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-generator-1.2.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmvn-generator = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( ) rpm-build ( ) mvn(org.apache.commons:commons-compress) ( ) lujavrite ( ) java-21-openjdk-headless ( )"
RPROVIDES:xmvn-generator = "rpm_lua(xmvn-generator) ( ) mvn(org.fedoraproject.xmvn:xmvn-generator) ( =  1.2.2) mvn(org.fedoraproject.xmvn:xmvn-generator:pom:) ( =  1.2.2) xmvn-generator ( =  1.2.2-8.el10) xmvn-generator(x86-64) ( =  1.2.2-8.el10)"

URI_xmvn-generator-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-generator-javadoc-1.2.2-8.el10.noarch.rpm;unpack=0"
RDEPENDS:xmvn-generator-javadoc = "javapackages-filesystem ( )"
RPROVIDES:xmvn-generator-javadoc = "xmvn-generator-javadoc ( =  1.2.2-8.el10)"
