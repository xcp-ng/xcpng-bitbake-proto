
PN = "javacc"
PE = "0"
PV = "7.0.13"
PR = "6.el10"
PACKAGES = "javacc javacc-demo javacc-javadoc javacc-manual"


URI_javacc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javacc-7.0.13-6.el10.noarch.rpm;unpack=0"
RDEPENDS:javacc = "javapackages-filesystem ( ) /usr/bin/bash ( ) javapackages-tools ( )"
RPROVIDES:javacc = "javacc ( =  7.0.13-6.el10) mvn(net.java.dev.javacc:javacc) ( =  7.0.13) mvn(net.java.dev.javacc:javacc:pom:) ( =  7.0.13)"

URI_javacc-demo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javacc-demo-7.0.13-6.el10.noarch.rpm;unpack=0"
RDEPENDS:javacc-demo = "javacc ( =  7.0.13-6.el10)"
RPROVIDES:javacc-demo = "javacc-demo ( =  7.0.13-6.el10)"

URI_javacc-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javacc-javadoc-7.0.13-6.el10.noarch.rpm;unpack=0"
RDEPENDS:javacc-javadoc = "javapackages-filesystem ( )"
RPROVIDES:javacc-javadoc = "javacc-javadoc ( =  7.0.13-6.el10)"

URI_javacc-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javacc-manual-7.0.13-6.el10.noarch.rpm;unpack=0"
RDEPENDS:javacc-manual = ""
RPROVIDES:javacc-manual = "javacc-manual ( =  7.0.13-6.el10)"
