
inherit dnf-bridge

PN = "xmlstarlet"
PE = "0"
PV = "1.6.1"
PR = "27.el10"
PACKAGES = "xmlstarlet"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xmlstarlet-1.6.1-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xmlstarlet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlstarlet-1.6.1-27.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xmlstarlet}"
RDEPENDS:xmlstarlet = " \
 glibc \
 libxslt \
 libxml2 \
"
