
PN = "apache-commons-beanutils"
PE = "0"
PV = "1.9.4"
PR = "21.el10_0"
PACKAGES = "apache-commons-beanutils apache-commons-beanutils-javadoc"


URI_apache-commons-beanutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-beanutils-1.9.4-21.el10_0.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-beanutils = "javapackages-filesystem ( ) mvn(commons-collections:commons-collections) ( ) mvn(commons-logging:commons-logging) ( )"
RPROVIDES:apache-commons-beanutils = "jpms(org.apache.commons.beanutils) ( =  1.9.4) mvn(commons-beanutils:commons-beanutils) ( =  1.9.4) mvn(commons-beanutils:commons-beanutils-bean-collections) ( =  1.9.4) mvn(commons-beanutils:commons-beanutils-bean-collections:pom:) ( =  1.9.4) mvn(commons-beanutils:commons-beanutils-core) ( =  1.9.4) mvn(commons-beanutils:commons-beanutils-core:pom:) ( =  1.9.4) mvn(commons-beanutils:commons-beanutils:pom:) ( =  1.9.4) mvn(org.apache.commons:commons-beanutils) ( =  1.9.4) mvn(org.apache.commons:commons-beanutils-bean-collections) ( =  1.9.4) mvn(org.apache.commons:commons-beanutils-bean-collections:pom:) ( =  1.9.4) mvn(org.apache.commons:commons-beanutils-core) ( =  1.9.4) mvn(org.apache.commons:commons-beanutils-core:pom:) ( =  1.9.4) mvn(org.apache.commons:commons-beanutils:pom:) ( =  1.9.4) osgi(org.apache.commons.beanutils) ( =  1.9.4) apache-commons-beanutils ( =  1.9.4-21.el10_0)"

URI_apache-commons-beanutils-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-beanutils-javadoc-1.9.4-21.el10_0.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-beanutils-javadoc = "javapackages-filesystem ( )"
RPROVIDES:apache-commons-beanutils-javadoc = "apache-commons-beanutils-javadoc ( =  1.9.4-21.el10_0)"
