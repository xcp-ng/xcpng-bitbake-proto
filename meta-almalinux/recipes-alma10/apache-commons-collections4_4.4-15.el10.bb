
inherit dnf-bridge

PN = "apache-commons-collections4"
PE = "0"
PV = "4.4"
PR = "15.el10"
PACKAGES = "apache-commons-collections4 apache-commons-collections4-javadoc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/apache-commons-collections4-4.4-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_apache-commons-collections4 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-commons-collections4-4.4-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-collections4}"
RDEPENDS:apache-commons-collections4 = " \
 javapackages-filesystem \
"

URI_apache-commons-collections4-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-commons-collections4-javadoc-4.4-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-collections4-javadoc}"
RDEPENDS:apache-commons-collections4-javadoc = " \
 javapackages-filesystem \
"
