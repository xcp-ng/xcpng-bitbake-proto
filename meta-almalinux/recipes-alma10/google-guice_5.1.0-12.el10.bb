
PN = "google-guice"
PE = "0"
PV = "5.1.0"
PR = "12.el10"
PACKAGES = "google-guice google-guice-javadoc guice-assistedinject guice-bom guice-extensions guice-grapher guice-jmx guice-jndi guice-parent guice-servlet guice-throwingproviders"


URI_google-guice = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-guice-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:google-guice = "javapackages-filesystem ( ) mvn(javax.inject:javax.inject) ( ) mvn(com.google.guava:guava) ( ) mvn(aopalliance:aopalliance) ( )"
RPROVIDES:google-guice = "jpms(com.google.guice) ( ) google-guice ( =  5.1.0-12.el10) mvn(com.google.inject:guice) ( =  5.1.0) mvn(com.google.inject:guice:pom:) ( =  5.1.0) osgi(com.google.inject) ( =  5.1.0)"

URI_google-guice-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/google-guice-javadoc-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:google-guice-javadoc = "javapackages-filesystem ( )"
RPROVIDES:google-guice-javadoc = "google-guice-javadoc ( =  5.1.0-12.el10)"

URI_guice-assistedinject = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-assistedinject-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-assistedinject = "javapackages-filesystem ( ) mvn(com.google.inject:guice) ( =  5.1.0)"
RPROVIDES:guice-assistedinject = "jpms(com.google.guice.extensions.assistedinject) ( ) mvn(com.google.inject.extensions:guice-assistedinject) ( =  5.1.0) guice-assistedinject ( =  5.1.0-12.el10) mvn(com.google.inject.extensions:guice-assistedinject:pom:) ( =  5.1.0) osgi(com.google.inject.assistedinject) ( =  5.1.0)"

URI_guice-bom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-bom-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-bom = "javapackages-filesystem ( ) mvn(com.google.inject:guice-parent:pom:) ( =  5.1.0)"
RPROVIDES:guice-bom = "guice-bom ( =  5.1.0-12.el10) mvn(com.google.inject:guice-bom:pom:) ( =  5.1.0)"

URI_guice-extensions = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-extensions-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-extensions = "javapackages-filesystem ( ) mvn(org.apache.felix:maven-bundle-plugin) ( ) mvn(org.apache.maven.plugins:maven-remote-resources-plugin) ( ) mvn(org.apache.maven.plugins:maven-source-plugin) ( ) mvn(com.google.inject:guice) ( =  5.1.0) mvn(com.google.inject:guice-parent:pom:) ( =  5.1.0)"
RPROVIDES:guice-extensions = "guice-extensions ( =  5.1.0-12.el10) mvn(com.google.inject.extensions:extensions-parent:pom:) ( =  5.1.0)"

URI_guice-grapher = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-grapher-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-grapher = "javapackages-filesystem ( ) mvn(com.google.inject:guice) ( =  5.1.0) mvn(com.google.inject.extensions:guice-assistedinject) ( =  5.1.0)"
RPROVIDES:guice-grapher = "jpms(com.google.guice.extensions.grapher) ( ) guice-grapher ( =  5.1.0-12.el10) mvn(com.google.inject.extensions:guice-grapher) ( =  5.1.0) mvn(com.google.inject.extensions:guice-grapher:pom:) ( =  5.1.0) osgi(com.google.inject.grapher) ( =  5.1.0)"

URI_guice-jmx = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-jmx-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-jmx = "javapackages-filesystem ( ) mvn(com.google.inject:guice) ( =  5.1.0)"
RPROVIDES:guice-jmx = "jpms(com.google.guice.extensions.jmx) ( ) guice-jmx ( =  5.1.0-12.el10) mvn(com.google.inject.extensions:guice-jmx) ( =  5.1.0) mvn(com.google.inject.extensions:guice-jmx:pom:) ( =  5.1.0) osgi(com.google.inject.tools.jmx) ( =  5.1.0)"

URI_guice-jndi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-jndi-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-jndi = "javapackages-filesystem ( ) mvn(com.google.inject:guice) ( =  5.1.0)"
RPROVIDES:guice-jndi = "jpms(com.google.guice.extensions.jndi) ( ) guice-jndi ( =  5.1.0-12.el10) mvn(com.google.inject.extensions:guice-jndi) ( =  5.1.0) mvn(com.google.inject.extensions:guice-jndi:pom:) ( =  5.1.0) osgi(com.google.inject.jndi) ( =  5.1.0)"

URI_guice-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-parent-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-parent = "javapackages-filesystem ( )"
RPROVIDES:guice-parent = "mvn(com.google.inject:guice-parent:pom:) ( =  5.1.0) guice-parent ( =  5.1.0-12.el10)"

URI_guice-servlet = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-servlet-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-servlet = "javapackages-filesystem ( ) mvn(com.google.inject:guice) ( =  5.1.0)"
RPROVIDES:guice-servlet = "jpms(com.google.guice.extensions.servlet) ( ) guice-servlet ( =  5.1.0-12.el10) mvn(com.google.inject.extensions:guice-servlet) ( =  5.1.0) mvn(com.google.inject.extensions:guice-servlet:pom:) ( =  5.1.0) osgi(com.google.inject.servlet) ( =  5.1.0)"

URI_guice-throwingproviders = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/guice-throwingproviders-5.1.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:guice-throwingproviders = "javapackages-filesystem ( ) mvn(com.google.code.findbugs:jsr305) ( ) mvn(com.google.inject:guice) ( =  5.1.0)"
RPROVIDES:guice-throwingproviders = "jpms(com.google.guice.extensions.throwingproviders) ( ) guice-throwingproviders ( =  5.1.0-12.el10) mvn(com.google.inject.extensions:guice-throwingproviders) ( =  5.1.0) mvn(com.google.inject.extensions:guice-throwingproviders:pom:) ( =  5.1.0) osgi(com.google.inject.throwingproviders) ( =  5.1.0)"
