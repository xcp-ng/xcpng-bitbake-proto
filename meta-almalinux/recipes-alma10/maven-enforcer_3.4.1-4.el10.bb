
PN = "maven-enforcer"
PE = "0"
PV = "3.4.1"
PR = "4.el10"
PACKAGES = "maven-enforcer maven-enforcer-api maven-enforcer-extension maven-enforcer-javadoc maven-enforcer-plugin maven-enforcer-rules"


URI_maven-enforcer = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-3.4.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-enforcer = "javapackages-filesystem ( ) mvn(org.apache.maven:maven-parent:pom:) ( )"
RPROVIDES:maven-enforcer = "maven-enforcer ( =  3.4.1-4.el10) mvn(org.apache.maven.enforcer:enforcer:pom:) ( =  3.4.1)"

URI_maven-enforcer-api = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-api-3.4.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-enforcer-api = "javapackages-filesystem ( )"
RPROVIDES:maven-enforcer-api = "mvn(org.apache.maven.enforcer:enforcer-api) ( =  3.4.1) maven-enforcer-api ( =  3.4.1-4.el10) mvn(org.apache.maven.enforcer:enforcer-api:pom:) ( =  3.4.1)"

URI_maven-enforcer-extension = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-extension-3.4.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-enforcer-extension = "javapackages-filesystem ( )"
RPROVIDES:maven-enforcer-extension = "maven-enforcer-extension ( =  3.4.1-4.el10) mvn(org.apache.maven.extensions:maven-enforcer-extension) ( =  3.4.1) mvn(org.apache.maven.extensions:maven-enforcer-extension:pom:) ( =  3.4.1)"

URI_maven-enforcer-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-javadoc-3.4.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-enforcer-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-enforcer-javadoc = "maven-enforcer-javadoc ( =  3.4.1-4.el10)"

URI_maven-enforcer-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-plugin-3.4.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-enforcer-plugin = "javapackages-filesystem ( ) mvn(javax.annotation:javax.annotation-api) ( ) mvn(org.apache.maven.enforcer:enforcer-api) ( =  3.4.1) mvn(org.apache.maven.enforcer:enforcer-rules) ( =  3.4.1)"
RPROVIDES:maven-enforcer-plugin = "maven-enforcer-plugin ( =  3.4.1-4.el10) mvn(org.apache.maven.plugins:maven-enforcer-plugin) ( =  3.4.1) mvn(org.apache.maven.plugins:maven-enforcer-plugin:pom:) ( =  3.4.1)"

URI_maven-enforcer-rules = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-rules-3.4.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-enforcer-rules = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(commons-io:commons-io) ( ) mvn(org.eclipse.aether:aether-util) ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(commons-codec:commons-codec) ( ) mvn(org.apache.maven.enforcer:enforcer-api) ( =  3.4.1)"
RPROVIDES:maven-enforcer-rules = "mvn(org.apache.maven.enforcer:enforcer-rules) ( =  3.4.1) maven-enforcer-rules ( =  3.4.1-4.el10) mvn(org.apache.maven.enforcer:enforcer-rules:pom:) ( =  3.4.1)"
