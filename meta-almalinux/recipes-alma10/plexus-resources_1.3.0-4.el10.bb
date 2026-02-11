
PN = "plexus-resources"
PE = "0"
PV = "1.3.0"
PR = "4.el10"
PACKAGES = "plexus-resources plexus-resources-javadoc"


URI_plexus-resources = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-resources-1.3.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-resources = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(javax.inject:javax.inject) ( ) mvn(org.codehaus.plexus:plexus-xml) ( )"
RPROVIDES:plexus-resources = "mvn(org.codehaus.plexus:plexus-resources) ( =  1.3.0) mvn(org.codehaus.plexus:plexus-resources:pom:) ( =  1.3.0) plexus-resources ( =  1.3.0-4.el10)"

URI_plexus-resources-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-resources-javadoc-1.3.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-resources-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-resources-javadoc = "plexus-resources-javadoc ( =  1.3.0-4.el10)"
