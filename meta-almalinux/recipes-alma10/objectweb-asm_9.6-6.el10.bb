
PN = "objectweb-asm"
PE = "0"
PV = "9.6"
PR = "6.el10"
PACKAGES = "objectweb-asm objectweb-asm-javadoc"


URI_objectweb-asm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/objectweb-asm-9.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:objectweb-asm = "
 bash
 javapackages-filesystem
 javapackages-tools
"

URI_objectweb-asm-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/objectweb-asm-javadoc-9.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:objectweb-asm-javadoc = "
 javapackages-filesystem
"
