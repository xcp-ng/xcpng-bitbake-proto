
inherit dnf-bridge

PN = "xml-commons-resolver"
PE = "0"
PV = "1.2"
PR = "45.el10"
PACKAGES = "xml-commons-resolver xml-commons-resolver-javadoc"


URI_xml-commons-resolver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xml-commons-resolver-1.2-45.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-resolver = " \
 bash \
 javapackages-filesystem \
 javapackages-tools \
"

URI_xml-commons-resolver-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xml-commons-resolver-javadoc-1.2-45.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-resolver-javadoc = " \
 javapackages-filesystem \
"
