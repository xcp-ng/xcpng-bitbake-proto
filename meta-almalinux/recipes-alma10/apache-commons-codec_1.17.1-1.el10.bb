
inherit dnf-bridge

PN = "apache-commons-codec"
PE = "0"
PV = "1.17.1"
PR = "1.el10"
PACKAGES = "apache-commons-codec apache-commons-codec-javadoc"


URI_apache-commons-codec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-codec-1.17.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-codec = " \
 javapackages-filesystem \
"

URI_apache-commons-codec-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-codec-javadoc-1.17.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-codec-javadoc = " \
 javapackages-filesystem \
"
