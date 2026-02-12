
inherit dnf-bridge

PN = "xmltoman"
PE = "0"
PV = "0.4"
PR = "32.el10"
PACKAGES = "xmltoman"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/xmltoman-0.4-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xmltoman = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmltoman-0.4-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmltoman}"
RDEPENDS:xmltoman = " \
 perl-interpreter \
 perl-XML-Parser \
"
