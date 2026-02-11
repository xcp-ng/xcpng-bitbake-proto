
inherit dnf-bridge

PN = "apache-commons-collections4"
PE = "0"
PV = "4.4"
PR = "15.el10"
PACKAGES = "apache-commons-collections4 apache-commons-collections4-javadoc"


URI_apache-commons-collections4 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-commons-collections4-4.4-15.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-collections4 = " \
 javapackages-filesystem \
"

URI_apache-commons-collections4-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-commons-collections4-javadoc-4.4-15.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-collections4-javadoc = " \
 javapackages-filesystem \
"
