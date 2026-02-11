
PN = "relaxng-datatype-java"
PE = "0"
PV = "2011.1"
PR = "6.el10"
PACKAGES = "relaxng-datatype-java relaxng-datatype-java-javadoc"


URI_relaxng-datatype-java = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/relaxng-datatype-java-2011.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:relaxng-datatype-java = "javapackages-filesystem ( )"
RPROVIDES:relaxng-datatype-java = "mvn(com.github.relaxng:relaxngDatatype) ( =  2011.1) mvn(com.github.relaxng:relaxngDatatype:pom:) ( =  2011.1) mvn(relaxngDatatype:relaxngDatatype) ( =  2011.1) mvn(relaxngDatatype:relaxngDatatype:pom:) ( =  2011.1) relaxng-datatype-java ( =  2011.1-6.el10)"

URI_relaxng-datatype-java-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/relaxng-datatype-java-javadoc-2011.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:relaxng-datatype-java-javadoc = "javapackages-filesystem ( )"
RPROVIDES:relaxng-datatype-java-javadoc = "relaxng-datatype-java-javadoc ( =  2011.1-6.el10)"
