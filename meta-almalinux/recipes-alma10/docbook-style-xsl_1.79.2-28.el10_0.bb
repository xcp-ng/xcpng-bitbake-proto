
inherit dnf-bridge

PN = "docbook-style-xsl"
PE = "0"
PV = "1.79.2"
PR = "28.el10_0"
PACKAGES = "docbook-style-xsl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/docbook-style-xsl-1.79.2-28.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_docbook-style-xsl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/docbook-style-xsl-1.79.2-28.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_docbook-style-xsl}"
RDEPENDS:docbook-style-xsl = " \
 xml-common \
 bash \
 libxml2 \
 docbook-dtds \
"
