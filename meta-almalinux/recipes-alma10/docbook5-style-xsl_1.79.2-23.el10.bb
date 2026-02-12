
inherit dnf-bridge

PN = "docbook5-style-xsl"
PE = "0"
PV = "1.79.2"
PR = "23.el10"
PACKAGES = "docbook5-style-xsl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/docbook5-style-xsl-1.79.2-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_docbook5-style-xsl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/docbook5-style-xsl-1.79.2-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_docbook5-style-xsl}"
RDEPENDS:docbook5-style-xsl = " \
 ruby \
 libxml2 \
 bash \
 xml-common \
 perl-interpreter \
"
