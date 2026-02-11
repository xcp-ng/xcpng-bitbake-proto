
PN = "xml-commons-apis"
PE = "0"
PV = "1.4.01"
PR = "47.el10"
PACKAGES = "xml-commons-apis xml-commons-apis-javadoc xml-commons-apis-manual"


URI_xml-commons-apis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xml-commons-apis-1.4.01-47.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-apis = " \
 javapackages-filesystem \
"

URI_xml-commons-apis-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xml-commons-apis-javadoc-1.4.01-47.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-apis-javadoc = " \
 javapackages-filesystem \
"

URI_xml-commons-apis-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xml-commons-apis-manual-1.4.01-47.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-commons-apis-manual = ""
