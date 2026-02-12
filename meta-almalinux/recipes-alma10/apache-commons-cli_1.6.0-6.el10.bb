
inherit dnf-bridge

PN = "apache-commons-cli"
PE = "0"
PV = "1.6.0"
PR = "6.el10"
PACKAGES = "apache-commons-cli apache-commons-cli-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/apache-commons-cli-1.6.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_apache-commons-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-cli-1.6.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-cli}"
RDEPENDS:apache-commons-cli = " \
 javapackages-filesystem \
"

URI_apache-commons-cli-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-cli-javadoc-1.6.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-cli-javadoc}"
RDEPENDS:apache-commons-cli-javadoc = " \
 javapackages-filesystem \
"
