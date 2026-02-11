
PN = "apache-commons-logging"
PE = "0"
PV = "1.3.4"
PR = "1.el10"
PACKAGES = "apache-commons-logging apache-commons-logging-javadoc"


URI_apache-commons-logging = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-logging-1.3.4-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-logging = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-logging = "jpms(org.apache.commons.logging) ( ) apache-commons-logging ( =  1.3.4-1.el10) jpms(org.apache.commons.logging) ( =  1.3.4) mvn(apache:commons-logging) ( =  1.3.4) mvn(apache:commons-logging::adapters:) ( =  1.3.4) mvn(apache:commons-logging::api:) ( =  1.3.4) mvn(apache:commons-logging:pom:) ( =  1.3.4) mvn(commons-logging:commons-logging) ( =  1.3.4) mvn(commons-logging:commons-logging::adapters:) ( =  1.3.4) mvn(commons-logging:commons-logging::api:) ( =  1.3.4) mvn(commons-logging:commons-logging:pom:) ( =  1.3.4) mvn(org.apache.commons:commons-logging) ( =  1.3.4) mvn(org.apache.commons:commons-logging::adapters:) ( =  1.3.4) mvn(org.apache.commons:commons-logging::api:) ( =  1.3.4) mvn(org.apache.commons:commons-logging:pom:) ( =  1.3.4) osgi(org.apache.commons.commons-logging) ( =  1.3.4)"

URI_apache-commons-logging-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-logging-javadoc-1.3.4-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-logging-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-logging-javadoc = "apache-commons-logging-javadoc ( =  1.3.4-1.el10)"
