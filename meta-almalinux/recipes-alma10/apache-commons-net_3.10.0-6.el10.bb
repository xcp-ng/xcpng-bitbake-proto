
inherit dnf-bridge

PN = "apache-commons-net"
PE = "0"
PV = "3.10.0"
PR = "6.el10"
PACKAGES = "apache-commons-net apache-commons-net-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/apache-commons-net-3.10.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_apache-commons-net = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-net-3.10.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-net}"
RDEPENDS:apache-commons-net = " \
 javapackages-filesystem \
"

URI_apache-commons-net-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-net-javadoc-3.10.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-net-javadoc}"
RDEPENDS:apache-commons-net-javadoc = " \
 javapackages-filesystem \
"
