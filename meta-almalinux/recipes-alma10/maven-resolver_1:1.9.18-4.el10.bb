
inherit dnf-bridge

PN = "maven-resolver"
PE = "1"
PV = "1.9.18"
PR = "4.el10"
PACKAGES = "maven-resolver maven-resolver-javadoc"


URI_maven-resolver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-resolver-1.9.18-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-resolver = " \
 httpcomponents-client \
 apache-commons-codec \
 httpcomponents-core \
 javapackages-filesystem \
 slf4j \
 jcl-over-slf4j \
 maven-lib \
 maven-wagon \
"

URI_maven-resolver-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-resolver-javadoc-1.9.18-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-resolver-javadoc = " \
 javapackages-filesystem \
"
