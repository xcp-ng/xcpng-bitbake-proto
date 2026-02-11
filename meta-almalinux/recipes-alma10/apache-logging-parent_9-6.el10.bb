
PN = "apache-logging-parent"
PE = "0"
PV = "9"
PR = "6.el10"
PACKAGES = "apache-logging-parent"


URI_apache-logging-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-logging-parent-9-6.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-logging-parent = "javapackages-filesystem ( ) mvn(org.apache:apache:pom:) ( ) java-headless ( or  (REL))"
RPROVIDES:apache-logging-parent = "apache-logging-parent ( =  9-6.el10) mvn(org.apache.logging:logging-parent:pom:) ( =  9)"
