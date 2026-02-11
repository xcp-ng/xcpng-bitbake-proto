
PN = "log4j"
PE = "0"
PV = "2.20.0"
PR = "9.el10"
PACKAGES = "log4j log4j-jcl log4j-slf4j log4j-bom log4j-javadoc log4j-web"


URI_log4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/log4j-2.20.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:log4j = "javapackages-filesystem ( )"
RPROVIDES:log4j = "jpms(org.apache.log4j) ( ) jpms(org.apache.logging.log4j.core) ( ) jpms(org.apache.logging.log4j.jpl) ( ) jpms(org.apache.logging.log4j.osgi) ( ) jpms(org.apache.logging.log4j.smtp) ( ) jpms(org.apache.logging.tojul) ( ) mvn(org.apache.logging.log4j:log4j-api) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-core) ( =  2.20.0) jpms(org.apache.logging.log4j) ( =  2.20.0) log4j ( =  2.20.0-9.el10) mvn(log4j:log4j) ( =  2.20.0) mvn(log4j:log4j:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-1.2-api) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-1.2-api:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-api-java9:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-api:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-core-java9:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-core:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-jakarta-smtp) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-jakarta-smtp:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-jpl) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-jpl:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-osgi) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-osgi:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-to-jul) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-to-jul:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j:pom:) ( =  2.20.0) osgi(org.apache.logging.log4j.1.2-api) ( =  2.20.0) osgi(org.apache.logging.log4j.api) ( =  2.20.0) osgi(org.apache.logging.log4j.core) ( =  2.20.0) osgi(org.apache.logging.log4j.jakarta-smtp) ( =  2.20.0) osgi(org.apache.logging.log4j.jpl) ( =  2.20.0) osgi(org.apache.logging.log4j.osgi) ( =  2.20.0) osgi(org.apache.logging.log4j.to-jul) ( =  2.20.0)"

URI_log4j-jcl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/log4j-jcl-2.20.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:log4j-jcl = "javapackages-filesystem ( ) mvn(commons-logging:commons-logging) ( ) mvn(org.apache.logging.log4j:log4j-api) ( =  2.20.0)"
RPROVIDES:log4j-jcl = "jpms(org.apache.logging.log4j.jcl) ( ) log4j-jcl ( =  2.20.0-9.el10) mvn(org.apache.logging.log4j:log4j-jcl) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-jcl:pom:) ( =  2.20.0) osgi(org.apache.logging.log4j.jcl) ( =  2.20.0)"

URI_log4j-slf4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/log4j-slf4j-2.20.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:log4j-slf4j = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) mvn(org.apache.logging.log4j:log4j-api) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-core) ( =  2.20.0)"
RPROVIDES:log4j-slf4j = "jpms(org.apache.logging.log4j.slf4j) ( ) jpms(org.apache.logging.slf4j) ( ) log4j-slf4j ( =  2.20.0-9.el10) mvn(org.apache.logging.log4j:log4j-slf4j-impl) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-slf4j-impl:pom:) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-to-slf4j) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-to-slf4j:pom:) ( =  2.20.0) osgi(org.apache.logging.log4j.slf4j-impl) ( =  2.20.0) osgi(org.apache.logging.log4j.to-slf4j) ( =  2.20.0)"

URI_log4j-bom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-bom-2.20.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:log4j-bom = "javapackages-filesystem ( )"
RPROVIDES:log4j-bom = "log4j-bom ( =  2.20.0-9.el10) mvn(org.apache.logging.log4j:log4j-bom:pom:) ( =  2.20.0)"

URI_log4j-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-javadoc-2.20.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:log4j-javadoc = "javapackages-filesystem ( )"
RPROVIDES:log4j-javadoc = "log4j-javadoc ( =  2.20.0-9.el10)"

URI_log4j-web = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-web-2.20.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:log4j-web = "javapackages-filesystem ( ) mvn(org.apache.logging.log4j:log4j-api) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-core) ( =  2.20.0)"
RPROVIDES:log4j-web = "jpms(org.apache.logging.log4j.web) ( ) log4j-web ( =  2.20.0-9.el10) mvn(org.apache.logging.log4j:log4j-web) ( =  2.20.0) mvn(org.apache.logging.log4j:log4j-web:pom:) ( =  2.20.0) osgi(org.apache.logging.log4j.web) ( =  2.20.0)"
