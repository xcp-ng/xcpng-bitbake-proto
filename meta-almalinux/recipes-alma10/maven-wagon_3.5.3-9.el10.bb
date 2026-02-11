
PN = "maven-wagon"
PE = "0"
PV = "3.5.3"
PR = "9.el10"
PACKAGES = "maven-wagon maven-wagon-javadoc"


URI_maven-wagon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-wagon-3.5.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-wagon = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.httpcomponents:httpclient) ( ) mvn(org.apache.httpcomponents:httpcore) ( ) mvn(org.slf4j:jcl-over-slf4j) ( )"
RPROVIDES:maven-wagon = "maven-wagon ( =  3.5.3-9.el10) maven-wagon-file ( =  3.5.3-9.el10) maven-wagon-http ( =  3.5.3-9.el10) maven-wagon-http-shared ( =  3.5.3-9.el10) maven-wagon-provider-api ( =  3.5.3-9.el10) maven-wagon-providers ( =  3.5.3-9.el10) mvn(org.apache.maven.wagon:wagon-file) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-file:pom:) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-http) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-http-shared) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-http-shared:pom:) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-http::shaded:) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-http:pom:) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-http:pom:shaded:) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-provider-api) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-provider-api:pom:) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon-providers:pom:) ( =  3.5.3) mvn(org.apache.maven.wagon:wagon:pom:) ( =  3.5.3)"

URI_maven-wagon-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-wagon-javadoc-3.5.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-wagon-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-wagon-javadoc = "maven-wagon-javadoc ( =  3.5.3-9.el10)"
