
PN = "osgi-compendium"
PE = "0"
PV = "7.0.0"
PR = "21.el10"
PACKAGES = "osgi-compendium osgi-compendium-javadoc"


URI_osgi-compendium = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-compendium-7.0.0-21.el10.noarch.rpm;unpack=0"
RDEPENDS:osgi-compendium = "javapackages-filesystem ( )"
RPROVIDES:osgi-compendium = "mvn(org.osgi:osgi.cmpn) ( =  7.0.0) mvn(org.osgi:osgi.cmpn:pom:) ( =  7.0.0) osgi(osgi.cmpn) ( =  7.0.0) osgi-compendium ( =  7.0.0-21.el10)"

URI_osgi-compendium-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/osgi-compendium-javadoc-7.0.0-21.el10.noarch.rpm;unpack=0"
RDEPENDS:osgi-compendium-javadoc = "javapackages-filesystem ( )"
RPROVIDES:osgi-compendium-javadoc = "osgi-compendium-javadoc ( =  7.0.0-21.el10)"
