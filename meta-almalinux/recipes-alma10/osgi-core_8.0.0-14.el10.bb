
PN = "osgi-core"
PE = "0"
PV = "8.0.0"
PR = "14.el10"
PACKAGES = "osgi-core osgi-core-javadoc"


URI_osgi-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-core-8.0.0-14.el10.noarch.rpm;unpack=0"
RDEPENDS:osgi-core = "javapackages-filesystem ( )"
RPROVIDES:osgi-core = "mvn(org.osgi:org.osgi.core) ( =  8.0.0) mvn(org.osgi:org.osgi.core:pom:) ( =  8.0.0) mvn(org.osgi:osgi.core) ( =  8.0.0) mvn(org.osgi:osgi.core:pom:) ( =  8.0.0) osgi(osgi.core) ( =  8.0.0) osgi-core ( =  8.0.0-14.el10)"

URI_osgi-core-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-core-javadoc-8.0.0-14.el10.noarch.rpm;unpack=0"
RDEPENDS:osgi-core-javadoc = "javapackages-filesystem ( )"
RPROVIDES:osgi-core-javadoc = "osgi-core-javadoc ( =  8.0.0-14.el10)"
