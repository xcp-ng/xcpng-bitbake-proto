
PN = "jackson-modules-base"
PE = "0"
PV = "2.16.1"
PR = "3.el10"
PACKAGES = "jackson-module-jaxb-annotations jackson-modules-base"


URI_jackson-module-jaxb-annotations = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-module-jaxb-annotations-2.16.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-module-jaxb-annotations = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson.core:jackson-core) ( ) mvn(com.fasterxml.jackson.core:jackson-databind) ( ) mvn(com.fasterxml.jackson.core:jackson-annotations) ( ) mvn(jakarta.xml.bind:jakarta.xml.bind-api) ( ) mvn(jakarta.activation:jakarta.activation-api) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-module-jaxb-annotations = "osgi(com.fasterxml.jackson.module.jackson-module-jaxb-annotations) ( =  2.16.1) jackson-module-jaxb-annotations ( =  2.16.1-3.el10) mvn(com.fasterxml.jackson.module:jackson-module-jaxb-annotations) ( =  2.16.1) mvn(com.fasterxml.jackson.module:jackson-module-jaxb-annotations:pom:) ( =  2.16.1)"

URI_jackson-modules-base = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-modules-base-2.16.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-modules-base = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson:jackson-base:pom:) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-modules-base = "jackson-modules-base ( =  2.16.1-3.el10) mvn(com.fasterxml.jackson.module:jackson-modules-base:pom:) ( =  2.16.1)"
