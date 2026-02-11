
PN = "jaxb-istack-commons"
PE = "0"
PV = "4.2.0"
PR = "9.el10"
PACKAGES = "jaxb-istack-commons-runtime jaxb-istack-commons-tools jaxb-istack-commons-maven-plugin jaxb-istack-commons-test"


URI_jaxb-istack-commons-runtime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-istack-commons-runtime-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-runtime = "javapackages-filesystem ( )"
RPROVIDES:jaxb-istack-commons-runtime = "jaxb-istack-commons-runtime ( =  4.2.0-9.el10) jpms(com.sun.istack.runtime) ( =  4.2.0) mvn(com.sun.istack:istack-commons-runtime) ( =  4.2.0) mvn(com.sun.istack:istack-commons-runtime:pom:) ( =  4.2.0) osgi(com.sun.istack.commons-runtime) ( =  4.2.0)"

URI_jaxb-istack-commons-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-istack-commons-tools-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-tools = "javapackages-filesystem ( )"
RPROVIDES:jaxb-istack-commons-tools = "jaxb-istack-commons-tools ( =  4.2.0-9.el10) jpms(com.sun.istack.tools) ( =  4.2.0) mvn(com.sun.istack:istack-commons-tools) ( =  4.2.0) mvn(com.sun.istack:istack-commons-tools:pom:) ( =  4.2.0) osgi(com.sun.istack.commons-tools) ( =  4.2.0)"

URI_jaxb-istack-commons-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-istack-commons-maven-plugin-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-maven-plugin = "javapackages-filesystem ( ) mvn(junit:junit) ( ) mvn(org.glassfish.jaxb:codemodel) ( ) mvn(org.apache.maven.resolver:maven-resolver-api) ( ) mvn(org.apache.maven.resolver:maven-resolver-impl) ( )"
RPROVIDES:jaxb-istack-commons-maven-plugin = "jaxb-istack-commons-maven-plugin ( =  4.2.0-9.el10) mvn(com.sun.istack:istack-commons-maven-plugin) ( =  4.2.0) mvn(com.sun.istack:istack-commons-maven-plugin:pom:) ( =  4.2.0)"

URI_jaxb-istack-commons-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-istack-commons-test-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-test = "javapackages-filesystem ( ) mvn(junit:junit) ( )"
RPROVIDES:jaxb-istack-commons-test = "jaxb-istack-commons-test ( =  4.2.0-9.el10) jpms(com.sun.istack.test) ( =  4.2.0) mvn(com.sun.istack:istack-commons-test) ( =  4.2.0) mvn(com.sun.istack:istack-commons-test:pom:) ( =  4.2.0) osgi(com.sun.istack.commons-test) ( =  4.2.0)"
