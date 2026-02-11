
PN = "jdom"
PE = "0"
PV = "1.1.3"
PR = "38.el10"
PACKAGES = "jdom jdom-demo jdom-javadoc"


URI_jdom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jdom-1.1.3-38.el10.noarch.rpm;unpack=0"
RDEPENDS:jdom = "
 javapackages-filesystem
"

URI_jdom-demo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jdom-demo-1.1.3-38.el10.noarch.rpm;unpack=0"
RDEPENDS:jdom-demo = "
 jdom
"

URI_jdom-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jdom-javadoc-1.1.3-38.el10.noarch.rpm;unpack=0"
RDEPENDS:jdom-javadoc = "
 javapackages-filesystem
"
