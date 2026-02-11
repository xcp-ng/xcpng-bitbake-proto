
PN = "maven-surefire"
PE = "0"
PV = "3.2.2"
PR = "6.el10"
PACKAGES = "maven-failsafe-plugin maven-surefire maven-surefire-javadoc maven-surefire-plugin maven-surefire-provider-junit maven-surefire-provider-junit5 maven-surefire-provider-testng"


URI_maven-failsafe-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-failsafe-plugin-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-failsafe-plugin = "javapackages-filesystem ( ) mvn(org.apache.maven.surefire:maven-surefire-common) ( =  3.2.2)"
RPROVIDES:maven-failsafe-plugin = "maven-failsafe-plugin ( =  3.2.2-6.el10) mvn(org.apache.maven.plugins:maven-failsafe-plugin) ( =  3.2.2) mvn(org.apache.maven.plugins:maven-failsafe-plugin:pom:) ( =  3.2.2)"

URI_maven-surefire = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire = "javapackages-filesystem ( ) mvn(commons-io:commons-io) ( ) mvn(org.apache.maven.shared:maven-common-artifact-filters) ( ) mvn(org.eclipse.aether:aether-util) ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(org.apache.maven.shared:maven-shared-utils) ( ) mvn(org.apache.commons:commons-compress) ( ) mvn(org.codehaus.plexus:plexus-java) ( ) procps-ng ( )"
RPROVIDES:maven-surefire = "mvn(org.apache.maven.surefire:common-java5) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-api) ( =  3.2.2) mvn(org.apache.maven.surefire:maven-surefire-common) ( =  3.2.2) maven-surefire ( =  3.2.2-6.el10) mvn(org.apache.maven.surefire:common-java5:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:maven-surefire-common:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-api:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-booter) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-booter:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-extensions-api) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-extensions-api:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-extensions-spi) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-extensions-spi:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-its) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-its:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-logger-api) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-logger-api:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-providers:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-shared-utils) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-shared-utils:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire:pom:) ( =  3.2.2)"

URI_maven-surefire-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-javadoc-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-surefire-javadoc = "maven-surefire-javadoc ( =  3.2.2-6.el10)"

URI_maven-surefire-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-plugin-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-plugin = "javapackages-filesystem ( ) mvn(org.apache.maven.surefire:maven-surefire-common) ( =  3.2.2) maven-surefire-provider-junit ( if  junit) maven-surefire-provider-junit5 ( if  junit5) maven-surefire-provider-testng ( if  testng)"
RPROVIDES:maven-surefire-plugin = "maven-surefire-plugin ( =  3.2.2-6.el10) mvn(org.apache.maven.plugins:maven-surefire-plugin) ( =  3.2.2) mvn(org.apache.maven.plugins:maven-surefire-plugin:pom:) ( =  3.2.2)"

URI_maven-surefire-provider-junit = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-provider-junit-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-provider-junit = "javapackages-filesystem ( ) mvn(org.apache.maven.surefire:common-java5) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-api) ( =  3.2.2)"
RPROVIDES:maven-surefire-provider-junit = "maven-surefire-provider-junit ( =  3.2.2-6.el10) mvn(org.apache.maven.surefire:common-junit3) ( =  3.2.2) mvn(org.apache.maven.surefire:common-junit3:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:common-junit4) ( =  3.2.2) mvn(org.apache.maven.surefire:common-junit48) ( =  3.2.2) mvn(org.apache.maven.surefire:common-junit48:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:common-junit4:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-junit3) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-junit3:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-junit4) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-junit47) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-junit47:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-junit4:pom:) ( =  3.2.2)"

URI_maven-surefire-provider-junit5 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-provider-junit5-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-provider-junit5 = "javapackages-filesystem ( ) mvn(org.junit.platform:junit-platform-launcher) ( ) mvn(org.apache.maven.surefire:common-java5) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-api) ( =  3.2.2)"
RPROVIDES:maven-surefire-provider-junit5 = "maven-surefire-provider-junit5 ( =  3.2.2-6.el10) mvn(org.apache.maven.surefire:surefire-junit-platform) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-junit-platform:pom:) ( =  3.2.2)"

URI_maven-surefire-provider-testng = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-provider-testng-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-provider-testng = "javapackages-filesystem ( ) mvn(org.apache.maven.surefire:common-java5) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-api) ( =  3.2.2)"
RPROVIDES:maven-surefire-provider-testng = "maven-surefire-provider-testng ( =  3.2.2-6.el10) mvn(org.apache.maven.surefire:surefire-testng) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-testng-utils) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-testng-utils:pom:) ( =  3.2.2) mvn(org.apache.maven.surefire:surefire-testng:pom:) ( =  3.2.2)"
