
PN = "apache-commons-cli"
PE = "0"
PV = "1.6.0"
PR = "6.el10"
PACKAGES = "apache-commons-cli apache-commons-cli-javadoc"


URI_apache-commons-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-cli-1.6.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-cli = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-cli = "apache-commons-cli ( =  1.6.0-6.el10) jpms(org.apache.commons.cli) ( =  1.6.0) mvn(commons-cli:commons-cli) ( =  1.6.0) mvn(commons-cli:commons-cli:pom:) ( =  1.6.0) mvn(org.apache.commons:commons-cli) ( =  1.6.0) mvn(org.apache.commons:commons-cli:pom:) ( =  1.6.0) osgi(org.apache.commons.cli) ( =  1.6.0)"

URI_apache-commons-cli-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-cli-javadoc-1.6.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-cli-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-cli-javadoc = "apache-commons-cli-javadoc ( =  1.6.0-6.el10)"
