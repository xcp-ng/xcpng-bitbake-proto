
PN = "jdom2"
PE = "0"
PV = "2.0.6.1"
PR = "8.el10"
PACKAGES = "jdom2 jdom2-javadoc"


URI_jdom2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jdom2-2.0.6.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:jdom2 = " \
 javapackages-filesystem \
"

URI_jdom2-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jdom2-javadoc-2.0.6.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:jdom2-javadoc = " \
 javapackages-filesystem \
"
