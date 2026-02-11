
PN = "plexus-classworlds"
PE = "0"
PV = "2.8.0"
PR = "4.el10"
PACKAGES = "plexus-classworlds plexus-classworlds-javadoc"


URI_plexus-classworlds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-classworlds-2.8.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-classworlds = "javapackages-filesystem ( )"
RPROVIDES:plexus-classworlds = "mvn(classworlds:classworlds) ( =  2.8.0) mvn(classworlds:classworlds:pom:) ( =  2.8.0) mvn(org.codehaus.plexus:plexus-classworlds) ( =  2.8.0) mvn(org.codehaus.plexus:plexus-classworlds:pom:) ( =  2.8.0) osgi(org.codehaus.plexus.classworlds) ( =  2.8.0) plexus-classworlds ( =  2.8.0-4.el10)"

URI_plexus-classworlds-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-classworlds-javadoc-2.8.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-classworlds-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-classworlds-javadoc = "plexus-classworlds-javadoc ( =  2.8.0-4.el10)"
