
PN = "sisu-mojos"
PE = "0"
PV = "0.9.0~M2"
PR = "5.el10"
PACKAGES = "sisu-mojos sisu-mojos-javadoc"


URI_sisu-mojos = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sisu-mojos-0.9.0~M2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:sisu-mojos = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.maven.shared:maven-common-artifact-filters) ( ) mvn(org.sonatype.plexus:plexus-build-api) ( ) mvn(org.eclipse.sisu:org.eclipse.sisu.inject) ( ) mvn(org.slf4j:slf4j-nop) ( )"
RPROVIDES:sisu-mojos = "mvn(org.eclipse.sisu:sisu-maven-plugin) ( =  0.9.0.M2) mvn(org.eclipse.sisu:sisu-maven-plugin:pom:) ( =  0.9.0.M2) mvn(org.sonatype.plugins:sisu-maven-plugin) ( =  0.9.0.M2) mvn(org.sonatype.plugins:sisu-maven-plugin:pom:) ( =  0.9.0.M2) sisu-mojos ( =  0.9.0~M2-5.el10)"

URI_sisu-mojos-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sisu-mojos-javadoc-0.9.0~M2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:sisu-mojos-javadoc = "javapackages-filesystem ( )"
RPROVIDES:sisu-mojos-javadoc = "sisu-mojos-javadoc ( =  0.9.0~M2-5.el10)"
