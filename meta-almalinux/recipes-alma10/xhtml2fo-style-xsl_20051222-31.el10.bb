
inherit dnf-bridge

PN = "xhtml2fo-style-xsl"
PE = "0"
PV = "20051222"
PR = "31.el10"
PACKAGES = "xhtml2fo-style-xsl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xhtml2fo-style-xsl-20051222-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xhtml2fo-style-xsl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xhtml2fo-style-xsl-20051222-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xhtml2fo-style-xsl}"
RDEPENDS:xhtml2fo-style-xsl = " \
 xhtml1-dtds \
 bash \
 xml-common \
"
