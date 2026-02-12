
inherit dnf-bridge

PN = "sgml-common"
PE = "0"
PV = "0.6.3"
PR = "65.el10"
PACKAGES = "sgml-common xml-common"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sgml-common-0.6.3-65.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sgml-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sgml-common-0.6.3-65.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_sgml-common}"
RDEPENDS:sgml-common = " \
 coreutils \
 bash \
"

URI_xml-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xml-common-0.6.3-65.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xml-common}"
RDEPENDS:xml-common = " \
 bash \
 libxml2 \
"
