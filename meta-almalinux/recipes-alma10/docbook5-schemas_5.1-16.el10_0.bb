
inherit dnf-bridge

PN = "docbook5-schemas"
PE = "0"
PV = "5.1"
PR = "16.el10_0"
PACKAGES = "docbook5-schemas"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/docbook5-schemas-5.1-16.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_docbook5-schemas = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/docbook5-schemas-5.1-16.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_docbook5-schemas}"
RDEPENDS:docbook5-schemas = " \
 bash \
 libxml2 \
 xml-common \
"
