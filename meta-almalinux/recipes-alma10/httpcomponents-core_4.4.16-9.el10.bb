
PN = "httpcomponents-core"
PE = "0"
PV = "4.4.16"
PR = "9.el10"
PACKAGES = "httpcomponents-core httpcomponents-core-javadoc"


URI_httpcomponents-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpcomponents-core-4.4.16-9.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-core = "javapackages-filesystem ( )"
RPROVIDES:httpcomponents-core = "jpms(org.apache.httpcomponents.httpcore) ( ) jpms(org.apache.httpcomponents.httpcore-nio) ( ) httpcomponents-core ( =  4.4.16-9.el10) mvn(org.apache.httpcomponents:httpcomponents-core:pom:) ( =  4.4.16) mvn(org.apache.httpcomponents:httpcore) ( =  4.4.16) mvn(org.apache.httpcomponents:httpcore-nio) ( =  4.4.16) mvn(org.apache.httpcomponents:httpcore-nio:pom:) ( =  4.4.16) mvn(org.apache.httpcomponents:httpcore:pom:) ( =  4.4.16) osgi(org.apache.httpcomponents.httpcore) ( =  4.4.16) osgi(org.apache.httpcomponents.httpcore-nio) ( =  4.4.16)"

URI_httpcomponents-core-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/httpcomponents-core-javadoc-4.4.16-9.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-core-javadoc = "javapackages-filesystem ( )"
RPROVIDES:httpcomponents-core-javadoc = "httpcomponents-core-javadoc ( =  4.4.16-9.el10)"
