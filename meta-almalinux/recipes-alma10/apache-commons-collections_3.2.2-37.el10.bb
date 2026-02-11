
PN = "apache-commons-collections"
PE = "0"
PV = "3.2.2"
PR = "37.el10"
PACKAGES = "apache-commons-collections apache-commons-collections-javadoc apache-commons-collections-testframework"


URI_apache-commons-collections = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-collections-3.2.2-37.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-collections = " \
 javapackages-filesystem \
"

URI_apache-commons-collections-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-collections-javadoc-3.2.2-37.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-collections-javadoc = " \
 javapackages-filesystem \
"

URI_apache-commons-collections-testframework = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-collections-testframework-3.2.2-37.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-collections-testframework = " \
 apache-commons-collections \
 javapackages-filesystem \
"
