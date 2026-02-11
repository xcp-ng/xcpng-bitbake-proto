
inherit dnf-bridge

PN = "apache-commons-logging"
PE = "0"
PV = "1.3.4"
PR = "1.el10"
PACKAGES = "apache-commons-logging apache-commons-logging-javadoc"


URI_apache-commons-logging = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-logging-1.3.4-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-logging = " \
 javapackages-filesystem \
"

URI_apache-commons-logging-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-logging-javadoc-1.3.4-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-logging-javadoc = " \
 javapackages-filesystem \
"
