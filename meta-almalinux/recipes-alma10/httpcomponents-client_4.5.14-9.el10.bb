
PN = "httpcomponents-client"
PE = "0"
PV = "4.5.14"
PR = "9.el10"
PACKAGES = "httpcomponents-client httpcomponents-client-javadoc"


URI_httpcomponents-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpcomponents-client-4.5.14-9.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-client = "javapackages-filesystem ( ) mvn(commons-codec:commons-codec) ( ) mvn(org.apache.httpcomponents:httpcore) ( ) publicsuffix-list ( )"
RPROVIDES:httpcomponents-client = "jpms(org.apache.httpcomponents.httpclient) ( ) httpcomponents-client ( =  4.5.14-9.el10) mvn(org.apache.httpcomponents:httpclient) ( =  4.5.14) mvn(org.apache.httpcomponents:httpclient:pom:) ( =  4.5.14) mvn(org.apache.httpcomponents:httpcomponents-client:pom:) ( =  4.5.14) osgi(org.apache.httpcomponents.httpclient) ( =  4.5.14)"

URI_httpcomponents-client-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/httpcomponents-client-javadoc-4.5.14-9.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-client-javadoc = "javapackages-filesystem ( )"
RPROVIDES:httpcomponents-client-javadoc = "httpcomponents-client-javadoc ( =  4.5.14-9.el10)"
