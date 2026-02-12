
inherit dnf-bridge

PN = "plexus-resources"
PE = "0"
PV = "1.3.0"
PR = "4.el10"
PACKAGES = "plexus-resources plexus-resources-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/plexus-resources-1.3.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_plexus-resources = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-resources-1.3.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-resources}"
RDEPENDS:plexus-resources = " \
 atinject \
 plexus-utils \
 javapackages-filesystem \
 plexus-xml \
 slf4j \
"

URI_plexus-resources-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-resources-javadoc-1.3.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-resources-javadoc}"
RDEPENDS:plexus-resources-javadoc = " \
 javapackages-filesystem \
"
