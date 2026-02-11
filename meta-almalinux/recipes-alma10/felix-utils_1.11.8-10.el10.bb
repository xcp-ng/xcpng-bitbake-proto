
PN = "felix-utils"
PE = "0"
PV = "1.11.8"
PR = "10.el10"
PACKAGES = "felix-utils felix-utils-javadoc"


URI_felix-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/felix-utils-1.11.8-10.el10.noarch.rpm;unpack=0"
RDEPENDS:felix-utils = "javapackages-filesystem ( )"
RPROVIDES:felix-utils = "felix-utils ( =  1.11.8-10.el10) mvn(org.apache.felix:org.apache.felix.utils) ( =  1.11.8) mvn(org.apache.felix:org.apache.felix.utils:pom:) ( =  1.11.8)"

URI_felix-utils-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/felix-utils-javadoc-1.11.8-10.el10.noarch.rpm;unpack=0"
RDEPENDS:felix-utils-javadoc = "javapackages-filesystem ( )"
RPROVIDES:felix-utils-javadoc = "felix-utils-javadoc ( =  1.11.8-10.el10)"
