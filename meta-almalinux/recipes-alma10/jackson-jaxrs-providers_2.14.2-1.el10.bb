
PN = "jackson-jaxrs-providers"
PE = "0"
PV = "2.14.2"
PR = "1.el10"
PACKAGES = "jackson-jaxrs-json-provider jackson-jaxrs-providers jackson-jaxrs-providers-datatypes jackson-jaxrs-providers-parent"


URI_jackson-jaxrs-json-provider = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-json-provider-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-json-provider = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson.module:jackson-module-jaxb-annotations) ( ) java-headless ( or  (REL)) mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-base) ( =  2.14.2)"
RPROVIDES:jackson-jaxrs-json-provider = "jackson-jaxrs-json-provider ( =  2.14.2-1.el10) mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider) ( =  2.14.2) mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:pom:) ( =  2.14.2) osgi(com.fasterxml.jackson.jaxrs.jackson-jaxrs-json-provider) ( =  2.14.2)"

URI_jackson-jaxrs-providers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-providers-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-providers = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson.core:jackson-core) ( ) mvn(com.fasterxml.jackson.core:jackson-databind) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-jaxrs-providers = "mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-base) ( =  2.14.2) jackson-jaxrs-providers ( =  2.14.2-1.el10) mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:pom:) ( =  2.14.2) osgi(com.fasterxml.jackson.jaxrs.jackson-jaxrs-base) ( =  2.14.2)"

URI_jackson-jaxrs-providers-datatypes = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-providers-datatypes-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-providers-datatypes = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson.core:jackson-core) ( ) mvn(com.fasterxml.jackson.core:jackson-databind) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-jaxrs-providers-datatypes = "jackson-jaxrs-providers-datatypes ( =  2.14.2-1.el10) mvn(com.fasterxml.jackson.datatype:jackson-datatype-jaxrs) ( =  2.14.2) mvn(com.fasterxml.jackson.datatype:jackson-datatype-jaxrs:pom:) ( =  2.14.2) osgi(com.fasterxml.jackson.datatype.jackson-datatype-jaxrs) ( =  2.14.2)"

URI_jackson-jaxrs-providers-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-jaxrs-providers-parent-2.14.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:jackson-jaxrs-providers-parent = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson:jackson-base:pom:) ( ) java-headless ( or  (REL))"
RPROVIDES:jackson-jaxrs-providers-parent = "jackson-jaxrs-providers-parent ( =  2.14.2-1.el10) mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-providers:pom:) ( =  2.14.2)"
