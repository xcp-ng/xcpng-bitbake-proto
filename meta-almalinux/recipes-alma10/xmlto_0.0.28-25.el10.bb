
PN = "xmlto"
PE = "0"
PV = "0.0.28"
PR = "25.el10"
PACKAGES = "xmlto xmlto-tex xmlto-xhtml"


URI_xmlto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlto-0.0.28-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlto = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) flex ( ) util-linux ( ) libxslt ( ) docbook-dtds ( ) docbook-xsl ( )"
RPROVIDES:xmlto = "xmlto ( =  0.0.28-25.el10) xmlto(x86-64) ( =  0.0.28-25.el10)"

URI_xmlto-tex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlto-tex-0.0.28-25.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlto-tex = "tex-passivetex ( ) xmlto ( =  0.0.28-25.el10)"
RPROVIDES:xmlto-tex = "xmlto-tex ( =  0.0.28-25.el10)"

URI_xmlto-xhtml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlto-xhtml-0.0.28-25.el10.noarch.rpm;unpack=0"
RDEPENDS:xmlto-xhtml = "xhtml2fo-style-xsl ( ) xmlto ( =  0.0.28-25.el10)"
RPROVIDES:xmlto-xhtml = "xmlto-xhtml ( =  0.0.28-25.el10)"
