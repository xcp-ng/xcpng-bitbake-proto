
PN = "jboss-logging-tools"
PE = "0"
PV = "2.2.1"
PR = "15.el10"
PACKAGES = "jboss-logging-tools"


URI_jboss-logging-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-logging-tools-2.2.1-15.el10.noarch.rpm;unpack=0"
RDEPENDS:jboss-logging-tools = "javapackages-filesystem ( ) mvn(org.jboss.jdeparser:jdeparser) ( ) java-headless ( or  (REL))"
RPROVIDES:jboss-logging-tools = "jboss-logging-tools ( =  2.2.1-15.el10) mvn(org.jboss.logging:jboss-logging-annotations) ( =  2.2.1.Final) mvn(org.jboss.logging:jboss-logging-annotations:pom:) ( =  2.2.1.Final) mvn(org.jboss.logging:jboss-logging-processor) ( =  2.2.1.Final) mvn(org.jboss.logging:jboss-logging-processor:pom:) ( =  2.2.1.Final) mvn(org.jboss.logging:jboss-logging-tools-parent:pom:) ( =  2.2.1.Final)"
