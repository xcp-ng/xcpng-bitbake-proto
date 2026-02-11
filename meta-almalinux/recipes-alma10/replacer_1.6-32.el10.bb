
PN = "replacer"
PE = "0"
PV = "1.6"
PR = "32.el10"
PACKAGES = "replacer replacer-javadoc"


URI_replacer = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/replacer-1.6-32.el10.noarch.rpm;unpack=0"
RDEPENDS:replacer = "javapackages-filesystem ( ) mvn(commons-io:commons-io) ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(org.apache.maven:maven-plugin-api) ( ) mvn(org.apache.ant:ant) ( ) mvn(xerces:xercesImpl) ( )"
RPROVIDES:replacer = "mvn(com.google.code.maven-replacer-plugin:maven-replacer-plugin) ( =  1.6.0) mvn(com.google.code.maven-replacer-plugin:maven-replacer-plugin:pom:) ( =  1.6.0) mvn(com.google.code.maven-replacer-plugin:replacer) ( =  1.6.0) mvn(com.google.code.maven-replacer-plugin:replacer:pom:) ( =  1.6.0) replacer ( =  1.6-32.el10)"

URI_replacer-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/replacer-javadoc-1.6-32.el10.noarch.rpm;unpack=0"
RDEPENDS:replacer-javadoc = "javapackages-filesystem ( )"
RPROVIDES:replacer-javadoc = "replacer-javadoc ( =  1.6-32.el10)"
