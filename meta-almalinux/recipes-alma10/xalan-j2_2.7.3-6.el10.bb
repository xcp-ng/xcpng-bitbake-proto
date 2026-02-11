
PN = "xalan-j2"
PE = "0"
PV = "2.7.3"
PR = "6.el10"
PACKAGES = "xalan-j2 xalan-j2-manual xalan-j2-xsltc"


URI_xalan-j2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xalan-j2-2.7.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:xalan-j2 = "
 javapackages-filesystem
 xerces-j2
"

URI_xalan-j2-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xalan-j2-manual-2.7.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:xalan-j2-manual = ""

URI_xalan-j2-xsltc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xalan-j2-xsltc-2.7.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:xalan-j2-xsltc = "
 javapackages-filesystem
 regexp
 xerces-j2
 xalan-j2
 bcel
 java_cup
"
