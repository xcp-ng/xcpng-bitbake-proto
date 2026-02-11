
PN = "sgml-common"
PE = "0"
PV = "0.6.3"
PR = "65.el10"
PACKAGES = "sgml-common xml-common"


URI_sgml-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sgml-common-0.6.3-65.el10.noarch.rpm;unpack=0"
RDEPENDS:sgml-common = "/usr/bin/sh ( ) /usr/bin/basename ( )"
RPROVIDES:sgml-common = "config(sgml-common) ( =  0.6.3-65.el10) sgml-common ( =  0.6.3-65.el10)"

URI_xml-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xml-common-0.6.3-65.el10.noarch.rpm;unpack=0"
RDEPENDS:xml-common = "/bin/sh ( ) /usr/bin/xmlcatalog ( )"
RPROVIDES:xml-common = "config(xml-common) ( =  0.6.3-65.el10) xml-common ( =  0.6.3-65.el10)"
