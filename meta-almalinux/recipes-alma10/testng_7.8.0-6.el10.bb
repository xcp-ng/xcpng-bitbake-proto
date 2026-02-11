
PN = "testng"
PE = "0"
PV = "7.8.0"
PR = "6.el10"
PACKAGES = "testng testng-javadoc"


URI_testng = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/testng-7.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:testng = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(com.beust:jcommander) ( )"
RPROVIDES:testng = "mvn(org.testng:testng) ( =  7.8.0) mvn(org.testng:testng::jdk15:) ( =  7.8.0) mvn(org.testng:testng:pom:) ( =  7.8.0) mvn(org.testng:testng:pom:jdk15:) ( =  7.8.0) testng ( =  7.8.0-6.el10)"

URI_testng-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/testng-javadoc-7.8.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:testng-javadoc = "javapackages-filesystem ( )"
RPROVIDES:testng-javadoc = "testng-javadoc ( =  7.8.0-6.el10)"
