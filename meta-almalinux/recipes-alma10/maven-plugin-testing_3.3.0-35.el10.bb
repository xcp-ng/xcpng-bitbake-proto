
PN = "maven-plugin-testing"
PE = "0"
PV = "3.3.0"
PR = "35.el10"
PACKAGES = "maven-plugin-testing maven-plugin-testing-harness maven-plugin-testing-javadoc"


URI_maven-plugin-testing = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-testing-3.3.0-35.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-testing = "javapackages-filesystem ( ) mvn(org.apache.maven:maven-parent:pom:) ( )"
RPROVIDES:maven-plugin-testing = "maven-plugin-testing ( =  3.3.0-35.el10) mvn(org.apache.maven.plugin-testing:maven-plugin-testing:pom:) ( =  3.3.0) mvn(org.apache.maven.shared:maven-plugin-testing:pom:) ( =  3.3.0)"

URI_maven-plugin-testing-harness = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-testing-harness-3.3.0-35.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-testing-harness = "javapackages-filesystem ( ) mvn(commons-io:commons-io) ( ) mvn(org.codehaus.plexus:plexus-archiver) ( )"
RPROVIDES:maven-plugin-testing-harness = "maven-plugin-testing-harness ( =  3.3.0-35.el10) mvn(org.apache.maven.plugin-testing:maven-plugin-testing-harness) ( =  3.3.0) mvn(org.apache.maven.plugin-testing:maven-plugin-testing-harness:pom:) ( =  3.3.0) mvn(org.apache.maven.shared:maven-plugin-testing-harness) ( =  3.3.0) mvn(org.apache.maven.shared:maven-plugin-testing-harness:pom:) ( =  3.3.0)"

URI_maven-plugin-testing-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-testing-javadoc-3.3.0-35.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-testing-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-plugin-testing-javadoc = "maven-plugin-testing-javadoc ( =  3.3.0-35.el10)"
