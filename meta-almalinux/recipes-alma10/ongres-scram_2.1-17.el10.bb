
PN = "ongres-scram"
PE = "0"
PV = "2.1"
PR = "17.el10"
PACKAGES = "ongres-scram ongres-scram-client ongres-scram-javadoc ongres-scram-parent"


URI_ongres-scram = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ongres-scram-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram = "javapackages-filesystem ( ) mvn(com.ongres.stringprep:saslprep) ( )"
RPROVIDES:ongres-scram = "mvn(com.ongres.scram:common) ( =  2.1) mvn(com.ongres.scram:common:pom:) ( =  2.1) ongres-scram ( =  2.1-17.el10)"

URI_ongres-scram-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ongres-scram-client-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram-client = "javapackages-filesystem ( ) mvn(com.ongres.scram:common) ( =  2.1)"
RPROVIDES:ongres-scram-client = "mvn(com.ongres.scram:client) ( =  2.1) mvn(com.ongres.scram:client:pom:) ( =  2.1) ongres-scram-client ( =  2.1-17.el10)"

URI_ongres-scram-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ongres-scram-javadoc-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram-javadoc = "javapackages-filesystem ( )"
RPROVIDES:ongres-scram-javadoc = "ongres-scram-javadoc ( =  2.1-17.el10)"

URI_ongres-scram-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ongres-scram-parent-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram-parent = "javapackages-filesystem ( ) mvn(org.apache.maven.plugins:maven-compiler-plugin) ( )"
RPROVIDES:ongres-scram-parent = "mvn(com.ongres.scram:parent:pom:) ( =  2.1) ongres-scram-parent ( =  2.1-17.el10)"
