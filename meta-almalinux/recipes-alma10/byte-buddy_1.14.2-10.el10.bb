
PN = "byte-buddy"
PE = "0"
PV = "1.14.2"
PR = "10.el10"
PACKAGES = "byte-buddy byte-buddy-agent byte-buddy-javadoc byte-buddy-maven-plugin"


URI_byte-buddy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byte-buddy-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.ow2.asm:asm-commons) ( )"
RPROVIDES:byte-buddy = "byte-buddy ( =  1.14.2-10.el10) jpms(net.bytebuddy) ( =  1.14.2) mvn(net.bytebuddy:byte-buddy) ( =  1.14.2) mvn(net.bytebuddy:byte-buddy-dep) ( =  1.14.2) mvn(net.bytebuddy:byte-buddy-dep:pom:) ( =  1.14.2) mvn(net.bytebuddy:byte-buddy:pom:) ( =  1.14.2) osgi(net.bytebuddy.byte-buddy) ( =  1.14.2)"

URI_byte-buddy-agent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/byte-buddy-agent-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy-agent = "javapackages-filesystem ( )"
RPROVIDES:byte-buddy-agent = "byte-buddy-agent ( =  1.14.2-10.el10) jpms(net.bytebuddy.agent) ( =  1.14.2) mvn(net.bytebuddy:byte-buddy-agent) ( =  1.14.2) mvn(net.bytebuddy:byte-buddy-agent:pom:) ( =  1.14.2) osgi(net.bytebuddy.byte-buddy-agent) ( =  1.14.2)"

URI_byte-buddy-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/byte-buddy-javadoc-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy-javadoc = "javapackages-filesystem ( )"
RPROVIDES:byte-buddy-javadoc = "byte-buddy-javadoc ( =  1.14.2-10.el10)"

URI_byte-buddy-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/byte-buddy-maven-plugin-1.14.2-10.el10.noarch.rpm;unpack=0"
RDEPENDS:byte-buddy-maven-plugin = "javapackages-filesystem ( ) mvn(org.sonatype.plexus:plexus-build-api) ( ) mvn(org.eclipse.aether:aether-util) ( ) mvn(org.eclipse.aether:aether-api) ( ) mvn(net.bytebuddy:byte-buddy) ( =  1.14.2)"
RPROVIDES:byte-buddy-maven-plugin = "byte-buddy-maven-plugin ( =  1.14.2-10.el10) mvn(net.bytebuddy:byte-buddy-maven-plugin) ( =  1.14.2) mvn(net.bytebuddy:byte-buddy-maven-plugin:pom:) ( =  1.14.2)"
