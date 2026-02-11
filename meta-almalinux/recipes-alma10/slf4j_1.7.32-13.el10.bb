
PN = "slf4j"
PE = "0"
PV = "1.7.32"
PR = "13.el10"
PACKAGES = "jcl-over-slf4j slf4j slf4j-jdk14 jul-to-slf4j log4j-over-slf4j slf4j-javadoc slf4j-jcl slf4j-manual slf4j-migrator slf4j-sources"


URI_jcl-over-slf4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jcl-over-slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:jcl-over-slf4j = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( =  1.7.32)"
RPROVIDES:jcl-over-slf4j = "jpms(org.apache.commons.logging) ( ) jcl-over-slf4j ( =  1.7.32-13.el10) mvn(org.slf4j:jcl-over-slf4j) ( =  1.7.32) mvn(org.slf4j:jcl-over-slf4j:pom:) ( =  1.7.32) osgi(jcl.over.slf4j) ( =  1.7.32)"

URI_slf4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:slf4j = "javapackages-filesystem ( )"
RPROVIDES:slf4j = "jpms(org.slf4j) ( ) jpms(org.slf4j.nop) ( ) jpms(org.slf4j.simple) ( ) mvn(org.slf4j:slf4j-api) ( =  1.7.32) mvn(org.slf4j:slf4j-api:pom:) ( =  1.7.32) mvn(org.slf4j:slf4j-nop) ( =  1.7.32) mvn(org.slf4j:slf4j-nop:pom:) ( =  1.7.32) mvn(org.slf4j:slf4j-simple) ( =  1.7.32) mvn(org.slf4j:slf4j-simple:pom:) ( =  1.7.32) osgi(slf4j.api) ( =  1.7.32) osgi(slf4j.nop) ( =  1.7.32) osgi(slf4j.simple) ( =  1.7.32) slf4j ( =  1.7.32-13.el10)"

URI_slf4j-jdk14 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slf4j-jdk14-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:slf4j-jdk14 = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( =  1.7.32)"
RPROVIDES:slf4j-jdk14 = "jpms(org.slf4j.jul) ( ) mvn(org.slf4j:slf4j-jdk14) ( =  1.7.32) mvn(org.slf4j:slf4j-jdk14:pom:) ( =  1.7.32) osgi(slf4j.jdk14) ( =  1.7.32) slf4j-jdk14 ( =  1.7.32-13.el10)"

URI_jul-to-slf4j = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jul-to-slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:jul-to-slf4j = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( =  1.7.32)"
RPROVIDES:jul-to-slf4j = "jul-to-slf4j ( =  1.7.32-13.el10) mvn(org.slf4j:jul-to-slf4j) ( =  1.7.32) mvn(org.slf4j:jul-to-slf4j:pom:) ( =  1.7.32) osgi(jul.to.slf4j) ( =  1.7.32)"

URI_log4j-over-slf4j = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-over-slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:log4j-over-slf4j = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( =  1.7.32)"
RPROVIDES:log4j-over-slf4j = "jpms(org.apache.log4j) ( ) log4j-over-slf4j ( =  1.7.32-13.el10) mvn(org.slf4j:log4j-over-slf4j) ( =  1.7.32) mvn(org.slf4j:log4j-over-slf4j:pom:) ( =  1.7.32) osgi(log4j.over.slf4j) ( =  1.7.32)"

URI_slf4j-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-javadoc-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:slf4j-javadoc = "javapackages-filesystem ( )"
RPROVIDES:slf4j-javadoc = "slf4j-javadoc ( =  1.7.32-13.el10)"

URI_slf4j-jcl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-jcl-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:slf4j-jcl = "javapackages-filesystem ( ) mvn(commons-logging:commons-logging) ( ) mvn(org.slf4j:slf4j-api) ( =  1.7.32) osgi(slf4j.api) ( =  1.7.32)"
RPROVIDES:slf4j-jcl = "mvn(org.slf4j:slf4j-jcl) ( =  1.7.32) mvn(org.slf4j:slf4j-jcl:pom:) ( =  1.7.32) osgi(slf4j.jcl) ( =  1.7.32) slf4j-jcl ( =  1.7.32-13.el10)"

URI_slf4j-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-manual-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:slf4j-manual = ""
RPROVIDES:slf4j-manual = "slf4j-manual ( =  1.7.32-13.el10)"

URI_slf4j-migrator = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-migrator-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:slf4j-migrator = "javapackages-filesystem ( )"
RPROVIDES:slf4j-migrator = "mvn(org.slf4j:slf4j-migrator) ( =  1.7.32) mvn(org.slf4j:slf4j-migrator:pom:) ( =  1.7.32) slf4j-migrator ( =  1.7.32-13.el10)"

URI_slf4j-sources = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-sources-1.7.32-13.el10.noarch.rpm;unpack=0"
RDEPENDS:slf4j-sources = "javapackages-filesystem ( ) mvn(commons-logging:commons-logging) ( ) mvn(org.slf4j:slf4j-api) ( =  1.7.32)"
RPROVIDES:slf4j-sources = "mvn(org.slf4j:jcl-over-slf4j::sources:) ( =  1.7.32) mvn(org.slf4j:jul-to-slf4j::sources:) ( =  1.7.32) mvn(org.slf4j:log4j-over-slf4j::sources:) ( =  1.7.32) mvn(org.slf4j:slf4j-api::sources:) ( =  1.7.32) mvn(org.slf4j:slf4j-jcl::sources:) ( =  1.7.32) mvn(org.slf4j:slf4j-jdk14::sources:) ( =  1.7.32) mvn(org.slf4j:slf4j-migrator::sources:) ( =  1.7.32) mvn(org.slf4j:slf4j-nop::sources:) ( =  1.7.32) mvn(org.slf4j:slf4j-simple::sources:) ( =  1.7.32) mvn(org.slf4j:slf4j-site::sources:) ( =  1.7.32) slf4j-sources ( =  1.7.32-13.el10)"
