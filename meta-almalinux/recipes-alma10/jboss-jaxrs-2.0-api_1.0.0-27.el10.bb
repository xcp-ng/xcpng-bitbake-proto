
PN = "jboss-jaxrs-2.0-api"
PE = "0"
PV = "1.0.0"
PR = "27.el10"
PACKAGES = "jboss-jaxrs-2.0-api"


URI_jboss-jaxrs-2.0-api = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-jaxrs-2.0-api-1.0.0-27.el10.noarch.rpm;unpack=0"
RDEPENDS:jboss-jaxrs-2.0-api = "javapackages-filesystem ( ) mvn(jakarta.xml.bind:jakarta.xml.bind-api) ( ) java-headless ( or  (REL))"
RPROVIDES:jboss-jaxrs-2.0-api = "osgi(org.jboss.spec.javax.ws.rs.jboss-jaxrs-api_2.0_spec) ( =  1.0.0) jboss-jaxrs-2.0-api ( =  1.0.0-27.el10) mvn(org.jboss.resteasy:jaxrs-api) ( =  1.0.0.Final) mvn(org.jboss.resteasy:jaxrs-api:pom:) ( =  1.0.0.Final) mvn(org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec) ( =  1.0.0.Final) mvn(org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec:pom:) ( =  1.0.0.Final)"
