
PN = "maven-plugin-tools"
PE = "0"
PV = "3.9.0"
PR = "7.el10"
PACKAGES = "maven-plugin-annotations maven-plugin-plugin maven-plugin-tools maven-plugin-tools-annotations maven-plugin-tools-api maven-plugin-tools-generators maven-plugin-tools-java maven-plugin-tools-javadoc"


URI_maven-plugin-annotations = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-annotations-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-annotations = "javapackages-filesystem ( )"
RPROVIDES:maven-plugin-annotations = "mvn(org.apache.maven.plugin-tools:maven-plugin-annotations) ( =  3.9.0) maven-plugin-annotations ( =  3.9.0-7.el10) mvn(org.apache.maven.plugin-tools:maven-plugin-annotations:pom:) ( =  3.9.0)"

URI_maven-plugin-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-plugin-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.sonatype.plexus:plexus-build-api) ( ) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) ( =  3.9.0) mvn(org.apache.maven.plugin-tools:maven-plugin-annotations) ( =  3.9.0) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-annotations) ( =  3.9.0) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-generators) ( =  3.9.0) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-java) ( =  3.9.0)"
RPROVIDES:maven-plugin-plugin = "maven-plugin-plugin ( =  3.9.0-7.el10) mvn(org.apache.maven.plugins:maven-plugin-plugin) ( =  3.9.0) mvn(org.apache.maven.plugins:maven-plugin-plugin:pom:) ( =  3.9.0)"

URI_maven-plugin-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools = "javapackages-filesystem ( ) mvn(org.apache.maven:maven-parent:pom:) ( )"
RPROVIDES:maven-plugin-tools = "maven-plugin-tools ( =  3.9.0-7.el10) mvn(org.apache.maven.plugin-tools:maven-plugin-tools:pom:) ( =  3.9.0)"

URI_maven-plugin-tools-annotations = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-annotations-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-annotations = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.codehaus.plexus:plexus-archiver) ( ) mvn(org.apache.maven:maven-core) ( ) mvn(org.apache.maven:maven-model) ( ) mvn(org.apache.maven:maven-plugin-api) ( ) mvn(com.thoughtworks.qdox:qdox) ( ) mvn(org.apache.maven:maven-artifact) ( ) mvn(org.eclipse.sisu:org.eclipse.sisu.plexus) ( ) mvn(org.jsoup:jsoup) ( ) mvn(org.ow2.asm:asm-util) ( ) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) ( =  3.9.0) mvn(org.apache.maven.plugin-tools:maven-plugin-annotations) ( =  3.9.0)"
RPROVIDES:maven-plugin-tools-annotations = "mvn(org.apache.maven.plugin-tools:maven-plugin-tools-annotations) ( =  3.9.0) maven-plugin-tools-annotations ( =  3.9.0-7.el10) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-annotations:pom:) ( =  3.9.0)"

URI_maven-plugin-tools-api = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-api-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-api = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.apache.maven:maven-core) ( ) mvn(org.apache.maven:maven-model) ( ) mvn(org.apache.maven:maven-plugin-api) ( ) mvn(org.apache.maven:maven-artifact) ( ) mvn(org.codehaus.plexus:plexus-java) ( ) mvn(org.apache.maven.wagon:wagon-provider-api) ( ) mvn(org.apache.httpcomponents:httpclient) ( ) mvn(org.apache.httpcomponents:httpcore) ( )"
RPROVIDES:maven-plugin-tools-api = "mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) ( =  3.9.0) maven-plugin-tools-api ( =  3.9.0-7.el10) maven-shared-plugin-tools-api ( =  3.9.0-7.el10) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api:pom:) ( =  3.9.0)"

URI_maven-plugin-tools-generators = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-generators-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-generators = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.ow2.asm:asm) ( ) mvn(org.apache.maven:maven-model) ( ) mvn(org.jsoup:jsoup) ( ) mvn(org.ow2.asm:asm-commons) ( ) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) ( =  3.9.0)"
RPROVIDES:maven-plugin-tools-generators = "mvn(org.apache.maven.plugin-tools:maven-plugin-tools-generators) ( =  3.9.0) maven-plugin-tools-generators ( =  3.9.0-7.el10) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-generators:pom:) ( =  3.9.0)"

URI_maven-plugin-tools-java = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-java-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-java = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.maven:maven-model) ( ) mvn(com.thoughtworks.qdox:qdox) ( ) mvn(org.eclipse.sisu:org.eclipse.sisu.plexus) ( ) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) ( =  3.9.0)"
RPROVIDES:maven-plugin-tools-java = "mvn(org.apache.maven.plugin-tools:maven-plugin-tools-java) ( =  3.9.0) maven-plugin-tools-java ( =  3.9.0-7.el10) maven-shared-plugin-tools-java ( =  3.9.0-7.el10) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-java:pom:) ( =  3.9.0)"

URI_maven-plugin-tools-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-tools-javadoc-3.9.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-plugin-tools-javadoc = "javapackages-filesystem ( )"
RPROVIDES:maven-plugin-tools-javadoc = "maven-plugin-tools-javadoc ( =  3.9.0-7.el10)"
