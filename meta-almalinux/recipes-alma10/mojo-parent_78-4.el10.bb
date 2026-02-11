
PN = "mojo-parent"
PE = "0"
PV = "78"
PR = "4.el10"
PACKAGES = "mojo-parent"


URI_mojo-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mojo-parent-78-4.el10.noarch.rpm;unpack=0"
RDEPENDS:mojo-parent = "javapackages-filesystem ( ) mvn(org.apache.maven.plugins:maven-assembly-plugin) ( )"
RPROVIDES:mojo-parent = "mojo-parent ( =  78-4.el10) mvn(org.codehaus.mojo:mojo-parent:pom:) ( =  78) mvn(org.codehaus.mojo:mojo:pom:) ( =  78)"
