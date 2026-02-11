
PN = "jboss-logging"
PE = "0"
PV = "3.5.3"
PR = "5.el10"
PACKAGES = "jboss-logging"


URI_jboss-logging = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-logging-3.5.3-5.el10.noarch.rpm;unpack=0"
RDEPENDS:jboss-logging = "javapackages-filesystem ( ) java-headless ( or  (REL))"
RPROVIDES:jboss-logging = "jpms(org.jboss.logging) ( ) osgi(org.jboss.logging.jboss-logging) ( =  3.5.3) jboss-logging ( =  3.5.3-5.el10) mvn(org.jboss.logging:jboss-logging) ( =  3.5.3.Final) mvn(org.jboss.logging:jboss-logging:pom:) ( =  3.5.3.Final)"
