
PN = "plexus-containers"
PE = "0"
PV = "2.2.0"
PR = "4.el10"
PACKAGES = "plexus-containers-component-annotations plexus-containers-component-metadata plexus-containers-javadoc"


URI_plexus-containers-component-annotations = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-containers-component-annotations-2.2.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-containers-component-annotations = "javapackages-filesystem ( )"
RPROVIDES:plexus-containers-component-annotations = "mvn(org.codehaus.plexus:plexus-component-annotations) ( =  2.2.0) mvn(org.codehaus.plexus:plexus-component-annotations:pom:) ( =  2.2.0) plexus-containers-component-annotations ( =  2.2.0-4.el10)"

URI_plexus-containers-component-metadata = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-containers-component-metadata-2.2.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-containers-component-metadata = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.ow2.asm:asm) ( ) mvn(com.thoughtworks.qdox:qdox) ( ) mvn(org.jdom:jdom2) ( ) mvn(org.codehaus.plexus:plexus-component-annotations) ( =  2.2.0)"
RPROVIDES:plexus-containers-component-metadata = "mvn(org.codehaus.plexus:plexus-component-metadata) ( =  2.2.0) mvn(org.codehaus.plexus:plexus-component-metadata:pom:) ( =  2.2.0) plexus-containers-component-metadata ( =  2.2.0-4.el10)"

URI_plexus-containers-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-containers-javadoc-2.2.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-containers-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-containers-javadoc = "plexus-containers-javadoc ( =  2.2.0-4.el10)"
