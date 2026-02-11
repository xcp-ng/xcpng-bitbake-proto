
PN = "modello"
PE = "0"
PV = "2.1.2"
PR = "7.el10"
PACKAGES = "modello modello-javadoc"


URI_modello = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/modello-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:modello = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) /usr/bin/bash ( ) javapackages-tools ( ) mvn(org.sonatype.plexus:plexus-build-api) ( ) mvn(org.codehaus.plexus:plexus-component-annotations) ( ) mvn(org.eclipse.sisu:org.eclipse.sisu.plexus) ( ) mvn(com.google.inject:guice) ( ) mvn(org.apache.velocity:velocity-engine-core) ( ) mvn(org.jsoup:jsoup) ( )"
RPROVIDES:modello = "modello ( =  2.1.2-7.el10) mvn(org.codehaus.modello:modello-core) ( =  2.1.2) mvn(org.codehaus.modello:modello-core:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-maven-plugin) ( =  2.1.2) mvn(org.codehaus.modello:modello-maven-plugin:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-converters) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-converters:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-dom4j) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-dom4j:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-java) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-java:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-jdom) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-jdom:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-sax) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-sax:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-stax) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-stax:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-velocity) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-velocity:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xdoc) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xdoc:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xml) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xml:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xpp3) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xpp3:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xsd) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugin-xsd:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello-plugins:pom:) ( =  2.1.2) mvn(org.codehaus.modello:modello:pom:) ( =  2.1.2)"

URI_modello-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/modello-javadoc-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:modello-javadoc = "javapackages-filesystem ( )"
RPROVIDES:modello-javadoc = "modello-javadoc ( =  2.1.2-7.el10)"
