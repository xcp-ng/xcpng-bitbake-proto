
inherit dnf-bridge

PN = "apache-commons-compress"
PE = "0"
PV = "1.27.1"
PR = "1.el10"
PACKAGES = "apache-commons-compress apache-commons-compress-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/apache-commons-compress-1.27.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_apache-commons-compress = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apache-commons-compress-1.27.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-compress}"
RDEPENDS:apache-commons-compress = " \
 apache-commons-codec \
 apache-commons-io \
 javapackages-filesystem \
 apache-commons-lang3 \
"

URI_apache-commons-compress-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-compress-javadoc-1.27.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-compress-javadoc}"
RDEPENDS:apache-commons-compress-javadoc = " \
 javapackages-filesystem \
"
