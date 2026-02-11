
PN = "plexus-languages"
PE = "0"
PV = "1.2.0"
PR = "7.el10"
PACKAGES = "plexus-languages plexus-languages-javadoc"


URI_plexus-languages = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-languages-1.2.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-languages = "javapackages-filesystem ( ) mvn(org.ow2.asm:asm) ( ) mvn(com.thoughtworks.qdox:qdox) ( )"
RPROVIDES:plexus-languages = "jpms(org.codehaus.plexus.languages.java) ( =  1.2.0) mvn(org.codehaus.plexus:plexus-java) ( =  1.2.0) mvn(org.codehaus.plexus:plexus-java:pom:) ( =  1.2.0) mvn(org.codehaus.plexus:plexus-languages:pom:) ( =  1.2.0) plexus-languages ( =  1.2.0-7.el10)"

URI_plexus-languages-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-languages-javadoc-1.2.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-languages-javadoc = "javapackages-filesystem ( )"
RPROVIDES:plexus-languages-javadoc = "plexus-languages-javadoc ( =  1.2.0-7.el10)"
