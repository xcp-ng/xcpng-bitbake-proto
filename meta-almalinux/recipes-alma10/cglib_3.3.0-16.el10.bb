
PN = "cglib"
PE = "0"
PV = "3.3.0"
PR = "16.el10"
PACKAGES = "cglib cglib-javadoc"


URI_cglib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cglib-3.3.0-16.el10.noarch.rpm;unpack=0"
RDEPENDS:cglib = " \
 objectweb-asm \
 javapackages-filesystem \
"

URI_cglib-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cglib-javadoc-3.3.0-16.el10.noarch.rpm;unpack=0"
RDEPENDS:cglib-javadoc = " \
 javapackages-filesystem \
"
