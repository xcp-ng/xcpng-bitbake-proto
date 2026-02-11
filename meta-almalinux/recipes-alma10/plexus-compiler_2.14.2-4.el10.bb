
PN = "plexus-compiler"
PE = "0"
PV = "2.14.2"
PR = "4.el10"
PACKAGES = "plexus-compiler plexus-compiler-extras plexus-compiler-javadoc plexus-compiler-pom"


URI_plexus-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-2.14.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-compiler = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(javax.inject:javax.inject) ( )"
RPROVIDES:plexus-compiler = "mvn(org.codehaus.plexus:plexus-compiler-api) ( =  2.14.2) mvn(org.codehaus.plexus:plexus-compiler-api:pom:) ( =  2.14.2) mvn(org.codehaus.plexus:plexus-compiler-javac) ( =  2.14.2) mvn(org.codehaus.plexus:plexus-compiler-javac:pom:) ( =  2.14.2) mvn(org.codehaus.plexus:plexus-compiler-manager) ( =  2.14.2) mvn(org.codehaus.plexus:plexus-compiler-manager:pom:) ( =  2.14.2) plexus-compiler ( =  2.14.2-4.el10)"

URI_plexus-compiler-extras = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-extras-2.14.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-compiler-extras = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(javax.inject:javax.inject) ( ) mvn(org.codehaus.plexus:plexus-compiler-api) ( =  2.14.2)"
RPROVIDES:plexus-compiler-extras = "mvn(org.codehaus.plexus:plexus-compiler-csharp) ( =  2.14.2) mvn(org.codehaus.plexus:plexus-compiler-csharp:pom:) ( =  2.14.2) plexus-compiler-extras ( =  2.14.2-4.el10)"

URI_plexus-compiler-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-javadoc-2.14.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-compiler-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-compiler-javadoc = "plexus-compiler-javadoc ( =  2.14.2-4.el10)"

URI_plexus-compiler-pom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-pom-2.14.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-compiler-pom = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus:pom:) ( ) mvn(org.eclipse.sisu:sisu-maven-plugin) ( ) mvn(org.codehaus.plexus:plexus-compiler-api) ( =  2.14.2)"
RPROVIDES:plexus-compiler-pom = "mvn(org.codehaus.plexus:plexus-compiler:pom:) ( =  2.14.2) mvn(org.codehaus.plexus:plexus-compilers:pom:) ( =  2.14.2) plexus-compiler-pom ( =  2.14.2-4.el10)"
