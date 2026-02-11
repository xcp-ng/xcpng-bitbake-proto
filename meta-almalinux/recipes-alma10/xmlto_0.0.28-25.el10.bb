
inherit dnf-bridge

PN = "xmlto"
PE = "0"
PV = "0.0.28"
PR = "25.el10"
PACKAGES = "xmlto xmlto-tex xmlto-xhtml"


URI_xmlto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlto-0.0.28-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlto = " \
 libxslt \
 flex \
 util-linux \
 docbook-dtds \
 docbook-style-xsl \
 bash \
 glibc \
"

URI_xmlto-tex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlto-tex-0.0.28-25.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlto-tex = " \
 texlive-passivetex \
 xmlto \
"

URI_xmlto-xhtml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlto-xhtml-0.0.28-25.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlto-xhtml = " \
 xhtml2fo-style-xsl \
 xmlto \
"
