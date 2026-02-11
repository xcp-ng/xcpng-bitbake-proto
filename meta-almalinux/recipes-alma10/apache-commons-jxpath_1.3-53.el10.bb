
PN = "apache-commons-jxpath"
PE = "0"
PV = "1.3"
PR = "53.el10"
PACKAGES = "apache-commons-jxpath apache-commons-jxpath-javadoc"


URI_apache-commons-jxpath = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-jxpath-1.3-53.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-jxpath = "
 javapackages-filesystem
"

URI_apache-commons-jxpath-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-jxpath-javadoc-1.3-53.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-commons-jxpath-javadoc = "
 javapackages-filesystem
"
