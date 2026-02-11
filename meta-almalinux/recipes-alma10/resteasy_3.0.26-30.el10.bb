
PN = "resteasy"
PE = "0"
PV = "3.0.26"
PR = "30.el10"
PACKAGES = "pki-resteasy-client pki-resteasy-core pki-resteasy-jackson2-provider pki-resteasy-servlet-initializer"


URI_pki-resteasy-client = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-client-3.0.26-30.el10.noarch.rpm;unpack=0"
RDEPENDS:pki-resteasy-client = "javapackages-filesystem ( ) mvn(org.jboss.logging:jboss-logging) ( ) mvn(org.jboss.logging:jboss-logging-annotations) ( ) mvn(org.jboss.logging:jboss-logging-processor) ( ) java-headless ( or  (REL)) mvn(org.jboss.resteasy:resteasy-jaxrs) ( =  3.0.26.Final)"
RPROVIDES:pki-resteasy-client = "mvn(org.jboss.resteasy:resteasy-client) ( =  3.0.26.Final) mvn(org.jboss.resteasy:resteasy-client:pom:) ( =  3.0.26.Final) pki-resteasy-client ( =  3.0.26-30.el10) resteasy-client ( =  3.0.26-30.el10)"

URI_pki-resteasy-core = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-core-3.0.26-30.el10.noarch.rpm;unpack=0"
RDEPENDS:pki-resteasy-core = "javapackages-filesystem ( ) mvn(jakarta.xml.bind:jakarta.xml.bind-api) ( ) mvn(org.apache.tomcat:tomcat-servlet-api) ( ) mvn(org.jboss.logging:jboss-logging) ( ) mvn(org.jboss.logging:jboss-logging-annotations) ( ) mvn(org.jboss.logging:jboss-logging-processor) ( ) mvn(commons-io:commons-io) ( ) mvn(org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec) ( ) mvn(jakarta.activation:jakarta.activation-api) ( ) mvn(javax.annotation:javax.annotation-api) ( ) mvn(org.apache.httpcomponents:httpclient) ( ) java-headless ( or  (REL))"
RPROVIDES:pki-resteasy-core = "mvn(org.jboss.resteasy:resteasy-jaxrs) ( =  3.0.26.Final) mvn(org.jboss.resteasy:providers-pom:pom:) ( =  3.0.26.Final) mvn(org.jboss.resteasy:resteasy-jaxrs-all:pom:) ( =  3.0.26.Final) mvn(org.jboss.resteasy:resteasy-jaxrs:pom:) ( =  3.0.26.Final) pki-resteasy-core ( =  3.0.26-30.el10) resteasy-core ( =  3.0.26-30.el10)"

URI_pki-resteasy-jackson2-provider = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-jackson2-provider-3.0.26-30.el10.noarch.rpm;unpack=0"
RDEPENDS:pki-resteasy-jackson2-provider = "javapackages-filesystem ( ) mvn(com.fasterxml.jackson.core:jackson-core) ( ) mvn(com.fasterxml.jackson.core:jackson-databind) ( ) mvn(com.fasterxml.jackson.core:jackson-annotations) ( ) mvn(org.apache.tomcat:tomcat-servlet-api) ( ) mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider) ( ) java-headless ( or  (REL))"
RPROVIDES:pki-resteasy-jackson2-provider = "mvn(org.jboss.resteasy:resteasy-jackson2-provider) ( =  3.0.26.Final) mvn(org.jboss.resteasy:resteasy-jackson2-provider:pom:) ( =  3.0.26.Final) pki-resteasy-jackson2-provider ( =  3.0.26-30.el10) resteasy-jackson2-provider ( =  3.0.26-30.el10)"

URI_pki-resteasy-servlet-initializer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-servlet-initializer-3.0.26-30.el10.noarch.rpm;unpack=0"
RDEPENDS:pki-resteasy-servlet-initializer = "javapackages-filesystem ( ) mvn(jakarta.xml.bind:jakarta.xml.bind-api) ( ) mvn(org.apache.tomcat:tomcat-servlet-api) ( ) mvn(org.jboss.logging:jboss-logging) ( ) mvn(org.jboss.logging:jboss-logging-annotations) ( ) mvn(org.jboss.logging:jboss-logging-processor) ( ) mvn(org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec) ( ) java-headless ( or  (REL)) mvn(org.jboss.resteasy:resteasy-jaxrs) ( =  3.0.26.Final)"
RPROVIDES:pki-resteasy-servlet-initializer = "mvn(org.jboss.resteasy:resteasy-servlet-initializer) ( =  3.0.26.Final) mvn(org.jboss.resteasy:resteasy-servlet-initializer:pom:) ( =  3.0.26.Final) pki-resteasy-servlet-initializer ( =  3.0.26-30.el10) resteasy-servlet-initializer ( =  3.0.26-30.el10)"
