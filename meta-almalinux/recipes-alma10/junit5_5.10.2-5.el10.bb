
PN = "junit5"
PE = "0"
PV = "5.10.2"
PR = "5.el10"
PACKAGES = "junit5 junit5-guide junit5-javadoc"


URI_junit5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/junit5-5.10.2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:junit5 = " \
 junit \
 javapackages-filesystem \
 univocity-parsers \
 opentest4j \
 assertj-core \
"

URI_junit5-guide = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/junit5-guide-5.10.2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:junit5-guide = " \
 junit5-javadoc \
"

URI_junit5-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/junit5-javadoc-5.10.2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:junit5-javadoc = " \
 javapackages-filesystem \
"
