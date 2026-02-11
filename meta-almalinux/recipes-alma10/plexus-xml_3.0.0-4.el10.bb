
PN = "plexus-xml"
PE = "0"
PV = "3.0.0"
PR = "4.el10"
PACKAGES = "plexus-xml plexus-xml-javadoc"


URI_plexus-xml = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-xml-3.0.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-xml = " \
 javapackages-filesystem \
"

URI_plexus-xml-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-xml-javadoc-3.0.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-xml-javadoc = " \
 javapackages-filesystem \
"
