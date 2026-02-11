
PN = "plexus-interpolation"
PE = "0"
PV = "1.27"
PR = "4.el10"
PACKAGES = "plexus-interpolation plexus-interpolation-javadoc"


URI_plexus-interpolation = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-interpolation-1.27-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-interpolation = "javapackages-filesystem ( )"
RPROVIDES:plexus-interpolation = "mvn(org.codehaus.plexus:plexus-interpolation) ( =  1.27) mvn(org.codehaus.plexus:plexus-interpolation:pom:) ( =  1.27) osgi(org.codehaus.plexus.interpolation) ( =  1.27.0) plexus-interpolation ( =  1.27-4.el10)"

URI_plexus-interpolation-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-interpolation-javadoc-1.27-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-interpolation-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-interpolation-javadoc = "plexus-interpolation-javadoc ( =  1.27-4.el10)"
