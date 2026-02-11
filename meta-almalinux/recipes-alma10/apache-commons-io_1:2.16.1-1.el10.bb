
PN = "apache-commons-io"
PE = "1"
PV = "2.16.1"
PR = "1.el10"
PACKAGES = "apache-commons-io apache-commons-io-javadoc"


URI_apache-commons-io = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-io-2.16.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-io = " \
 javapackages-filesystem \
"

URI_apache-commons-io-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-io-javadoc-2.16.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-io-javadoc = " \
 javapackages-filesystem \
"
