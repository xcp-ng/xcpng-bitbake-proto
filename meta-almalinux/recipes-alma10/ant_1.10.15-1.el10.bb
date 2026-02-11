
PN = "ant"
PE = "0"
PV = "1.10.15"
PR = "1.el10"
PACKAGES = "ant ant-antlr ant-apache-bcel ant-apache-bsf ant-apache-oro ant-apache-regexp ant-apache-resolver ant-apache-xalan2 ant-commons-logging ant-commons-net ant-jakartamail ant-jdepend ant-jmf ant-jsch ant-junit ant-junit5 ant-lib ant-swing ant-testutil ant-unbound ant-xz ant-imageio ant-javadoc ant-manual ant-openjdk21"


URI_ant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant = " \
 ant-lib \
 ant-unbound \
"

URI_ant-antlr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-antlr-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-antlr = " \
 ant-lib \
 ant \
 javapackages-filesystem \
 antlr-tool \
"

URI_ant-apache-bcel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-bcel-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-bcel = " \
 bcel \
 ant \
 javapackages-filesystem \
 ant-lib \
"

URI_ant-apache-bsf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-bsf-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-bsf = " \
 ant-lib \
 ant \
 javapackages-filesystem \
 bsf \
"

URI_ant-apache-oro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-oro-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-oro = " \
 ant-lib \
 ant \
 javapackages-filesystem \
 jakarta-oro \
"

URI_ant-apache-regexp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-regexp-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-regexp = " \
 ant-lib \
 ant \
 regexp \
 javapackages-filesystem \
"

URI_ant-apache-resolver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-resolver-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-resolver = " \
 ant \
 xml-commons-resolver \
 javapackages-filesystem \
 ant-lib \
"

URI_ant-apache-xalan2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-apache-xalan2-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-apache-xalan2 = " \
 ant-lib \
 ant \
 javapackages-filesystem \
 xalan-j2 \
"

URI_ant-commons-logging = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-commons-logging-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-commons-logging = " \
 ant-lib \
 ant \
 javapackages-filesystem \
"

URI_ant-commons-net = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-commons-net-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-commons-net = " \
 ant-lib \
 ant \
 javapackages-filesystem \
 apache-commons-net \
"

URI_ant-jakartamail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jakartamail-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jakartamail = " \
 ant-lib \
 ant \
 jakarta-mail \
 javapackages-filesystem \
"

URI_ant-jdepend = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jdepend-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jdepend = " \
 jdepend \
 ant \
 javapackages-filesystem \
 ant-lib \
"

URI_ant-jmf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jmf-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jmf = " \
 ant-lib \
 ant \
 javapackages-filesystem \
"

URI_ant-jsch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-jsch-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-jsch = " \
 ant-lib \
 ant \
 javapackages-filesystem \
 jsch \
"

URI_ant-junit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-junit-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-junit = " \
 ant-lib \
 ant \
 junit \
 javapackages-filesystem \
"

URI_ant-junit5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-junit5-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-junit5 = " \
 junit5 \
 ant \
 javapackages-filesystem \
 ant-lib \
"

URI_ant-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-lib-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-lib = " \
 javapackages-filesystem \
"

URI_ant-swing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-swing-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-swing = " \
 ant-lib \
 ant \
 javapackages-filesystem \
"

URI_ant-testutil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-testutil-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-testutil = " \
 ant-lib \
 ant \
 junit \
 javapackages-filesystem \
"

URI_ant-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-unbound-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-unbound = " \
 ant \
 javapackages-tools \
"

URI_ant-xz = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ant-xz-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-xz = " \
 ant \
 xz-java \
 javapackages-filesystem \
 ant-lib \
"

URI_ant-imageio = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-imageio-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-imageio = " \
 ant-lib \
 ant \
 javapackages-filesystem \
"

URI_ant-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-javadoc-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-javadoc = " \
 javapackages-filesystem \
"

URI_ant-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-manual-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-manual = ""

URI_ant-openjdk21 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ant-openjdk21-1.10.15-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ant-openjdk21 = " \
 ant \
 java-21-openjdk-headless \
 javapackages-tools \
"
