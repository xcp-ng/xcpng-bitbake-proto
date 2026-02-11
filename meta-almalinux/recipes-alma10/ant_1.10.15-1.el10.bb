
PN = "ant"
PE = "0"
PV = "1.10.15"
PR = "1.el10"
PACKAGES = "ant ant-antlr ant-apache-bcel ant-apache-bsf ant-apache-oro ant-apache-regexp ant-apache-resolver ant-apache-xalan2 ant-commons-logging ant-commons-net ant-jakartamail ant-jdepend ant-jmf ant-jsch ant-junit ant-junit5 ant-lib ant-swing ant-testutil ant-unbound ant-xz ant-imageio ant-javadoc ant-manual ant-openjdk21"


URI_ant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant = "ant-jdk-binding ( ) ant-lib ( =  1.10.15-1.el10)"
RPROVIDES:ant = "ant ( =  1.10.15-1.el10) config(ant) ( =  1.10.15-1.el10)"

URI_ant-antlr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-antlr-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-antlr = "javapackages-filesystem ( ) mvn(antlr:antlr) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-antlr = "ant-antlr ( =  1.10.15-1.el10) config(ant-antlr) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-antlr) ( =  1.10.15) mvn(org.apache.ant:ant-antlr:pom:) ( =  1.10.15)"

URI_ant-apache-bcel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-bcel-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-bcel = "javapackages-filesystem ( ) mvn(org.apache.bcel:bcel) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-apache-bcel = "ant-apache-bcel ( =  1.10.15-1.el10) config(ant-apache-bcel) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-apache-bcel) ( =  1.10.15) mvn(org.apache.ant:ant-apache-bcel:pom:) ( =  1.10.15)"

URI_ant-apache-bsf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-bsf-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-bsf = "javapackages-filesystem ( ) mvn(bsf:bsf) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-apache-bsf = "ant-apache-bsf ( =  1.10.15-1.el10) config(ant-apache-bsf) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-apache-bsf) ( =  1.10.15) mvn(org.apache.ant:ant-apache-bsf:pom:) ( =  1.10.15)"

URI_ant-apache-oro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-oro-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-oro = "javapackages-filesystem ( ) mvn(oro:oro) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-apache-oro = "ant-apache-oro ( =  1.10.15-1.el10) config(ant-apache-oro) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-apache-oro) ( =  1.10.15) mvn(org.apache.ant:ant-apache-oro:pom:) ( =  1.10.15)"

URI_ant-apache-regexp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-regexp-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-regexp = "javapackages-filesystem ( ) mvn(jakarta-regexp:jakarta-regexp) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-apache-regexp = "ant-apache-regexp ( =  1.10.15-1.el10) config(ant-apache-regexp) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-apache-regexp) ( =  1.10.15) mvn(org.apache.ant:ant-apache-regexp:pom:) ( =  1.10.15)"

URI_ant-apache-resolver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-resolver-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-resolver = "javapackages-filesystem ( ) mvn(xml-resolver:xml-resolver) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-apache-resolver = "ant-apache-resolver ( =  1.10.15-1.el10) config(ant-apache-resolver) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-apache-resolver) ( =  1.10.15) mvn(org.apache.ant:ant-apache-resolver:pom:) ( =  1.10.15)"

URI_ant-apache-xalan2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-xalan2-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-xalan2 = "javapackages-filesystem ( ) mvn(xalan:serializer) ( ) mvn(xalan:xalan) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-apache-xalan2 = "ant-apache-xalan2 ( =  1.10.15-1.el10) config(ant-apache-xalan2) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-apache-xalan2) ( =  1.10.15) mvn(org.apache.ant:ant-apache-xalan2:pom:) ( =  1.10.15)"

URI_ant-commons-logging = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-commons-logging-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-commons-logging = "javapackages-filesystem ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-commons-logging = "ant-commons-logging ( =  1.10.15-1.el10) config(ant-commons-logging) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-commons-logging) ( =  1.10.15) mvn(org.apache.ant:ant-commons-logging:pom:) ( =  1.10.15)"

URI_ant-commons-net = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-commons-net-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-commons-net = "javapackages-filesystem ( ) mvn(commons-net:commons-net) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-commons-net = "ant-commons-net ( =  1.10.15-1.el10) config(ant-commons-net) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-commons-net) ( =  1.10.15) mvn(org.apache.ant:ant-commons-net:pom:) ( =  1.10.15)"

URI_ant-jakartamail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jakartamail-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jakartamail = "javapackages-filesystem ( ) mvn(jakarta.mail:jakarta.mail-api) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-jakartamail = "ant-jakartamail ( =  1.10.15-1.el10) config(ant-jakartamail) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-jakartamail) ( =  1.10.15) mvn(org.apache.ant:ant-jakartamail:pom:) ( =  1.10.15)"

URI_ant-jdepend = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jdepend-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jdepend = "javapackages-filesystem ( ) mvn(jdepend:jdepend) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-jdepend = "ant-jdepend ( =  1.10.15-1.el10) config(ant-jdepend) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-jdepend) ( =  1.10.15) mvn(org.apache.ant:ant-jdepend:pom:) ( =  1.10.15)"

URI_ant-jmf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jmf-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jmf = "javapackages-filesystem ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-jmf = "ant-jmf ( =  1.10.15-1.el10) config(ant-jmf) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-jmf) ( =  1.10.15) mvn(org.apache.ant:ant-jmf:pom:) ( =  1.10.15)"

URI_ant-jsch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jsch-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jsch = "javapackages-filesystem ( ) mvn(com.jcraft:jsch) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-jsch = "ant-jsch ( =  1.10.15-1.el10) config(ant-jsch) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-jsch) ( =  1.10.15) mvn(org.apache.ant:ant-jsch:pom:) ( =  1.10.15)"

URI_ant-junit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-junit-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-junit = "javapackages-filesystem ( ) mvn(junit:junit) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-junit = "ant-junit ( =  1.10.15-1.el10) config(ant-junit) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-junit) ( =  1.10.15) mvn(org.apache.ant:ant-junit4) ( =  1.10.15) mvn(org.apache.ant:ant-junit4:pom:) ( =  1.10.15) mvn(org.apache.ant:ant-junit:pom:) ( =  1.10.15)"

URI_ant-junit5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-junit5-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-junit5 = "javapackages-filesystem ( ) mvn(org.junit.platform:junit-platform-launcher) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-junit5 = "ant-junit5 ( =  1.10.15-1.el10) config(ant-junit5) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-junitlauncher) ( =  1.10.15) mvn(org.apache.ant:ant-junitlauncher:pom:) ( =  1.10.15)"

URI_ant-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-lib-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-lib = "javapackages-filesystem ( )"
RPROVIDES:ant-lib = "mvn(org.apache.ant:ant) ( =  1.10.15) ant-lib ( =  1.10.15-1.el10) mvn(ant:ant) ( =  1.10.15) mvn(ant:ant-launcher) ( =  1.10.15) mvn(ant:ant-launcher:pom:) ( =  1.10.15) mvn(ant:ant:pom:) ( =  1.10.15) mvn(apache:ant) ( =  1.10.15) mvn(apache:ant:pom:) ( =  1.10.15) mvn(org.apache.ant:ant-bootstrap) ( =  1.10.15) mvn(org.apache.ant:ant-launcher) ( =  1.10.15) mvn(org.apache.ant:ant-launcher:pom:) ( =  1.10.15) mvn(org.apache.ant:ant-nodeps) ( =  1.10.15) mvn(org.apache.ant:ant-nodeps:pom:) ( =  1.10.15) mvn(org.apache.ant:ant-parent:pom:) ( =  1.10.15) mvn(org.apache.ant:ant:pom:) ( =  1.10.15)"

URI_ant-swing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-swing-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-swing = "javapackages-filesystem ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-swing = "ant-swing ( =  1.10.15-1.el10) config(ant-swing) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-swing) ( =  1.10.15) mvn(org.apache.ant:ant-swing:pom:) ( =  1.10.15)"

URI_ant-testutil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-testutil-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-testutil = "javapackages-filesystem ( ) mvn(junit:junit) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-testutil = "ant-testutil ( =  1.10.15-1.el10) config(ant-testutil) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-testutil) ( =  1.10.15) mvn(org.apache.ant:ant-testutil:pom:) ( =  1.10.15)"

URI_ant-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-unbound-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-unbound = "ant ( ) javapackages-tools ( )"
RPROVIDES:ant-unbound = "ant-jdk-binding ( ) ant-unbound ( =  1.10.15-1.el10)"

URI_ant-xz = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-xz-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-xz = "javapackages-filesystem ( ) mvn(org.tukaani:xz) ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-xz = "ant-xz ( =  1.10.15-1.el10) config(ant-xz) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-xz) ( =  1.10.15) mvn(org.apache.ant:ant-xz:pom:) ( =  1.10.15)"

URI_ant-imageio = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-imageio-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-imageio = "javapackages-filesystem ( ) ant ( =  1.10.15-1.el10) mvn(org.apache.ant:ant) ( =  1.10.15)"
RPROVIDES:ant-imageio = "ant-imageio ( =  1.10.15-1.el10) config(ant-imageio) ( =  1.10.15-1.el10) mvn(org.apache.ant:ant-imageio) ( =  1.10.15) mvn(org.apache.ant:ant-imageio:pom:) ( =  1.10.15)"

URI_ant-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-javadoc-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-javadoc = "javapackages-filesystem ( )"
RPROVIDES:ant-javadoc = "ant-javadoc ( =  1.10.15-1.el10)"

URI_ant-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-manual-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-manual = ""
RPROVIDES:ant-manual = "ant-manual ( =  1.10.15-1.el10)"

URI_ant-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-openjdk21-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-openjdk21 = "javapackages-tools ( ) ant ( ) java-21-openjdk-headless ( )"
RPROVIDES:ant-openjdk21 = "ant-jdk-binding ( ) ant-openjdk21 ( =  1.10.15-1.el10)"
