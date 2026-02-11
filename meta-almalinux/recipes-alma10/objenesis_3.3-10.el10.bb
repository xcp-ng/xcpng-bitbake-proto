
PN = "objenesis"
PE = "0"
PV = "3.3"
PR = "10.el10"
PACKAGES = "objenesis objenesis-javadoc"


URI_objenesis = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/objenesis-3.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:objenesis = " \
 javapackages-filesystem \
"

URI_objenesis-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/objenesis-javadoc-3.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:objenesis-javadoc = " \
 javapackages-filesystem \
"
