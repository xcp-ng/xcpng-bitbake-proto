
inherit dnf-bridge

PN = "objectweb-asm"
PE = "0"
PV = "9.6"
PR = "6.el10"
PACKAGES = "objectweb-asm objectweb-asm-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/objectweb-asm-9.6-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_objectweb-asm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/objectweb-asm-9.6-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_objectweb-asm}"
RDEPENDS:objectweb-asm = " \
 bash \
 javapackages-filesystem \
 javapackages-tools \
"

URI_objectweb-asm-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/objectweb-asm-javadoc-9.6-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_objectweb-asm-javadoc}"
RDEPENDS:objectweb-asm-javadoc = " \
 javapackages-filesystem \
"
