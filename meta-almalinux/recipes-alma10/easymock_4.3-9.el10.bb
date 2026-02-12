
inherit dnf-bridge

PN = "easymock"
PE = "0"
PV = "4.3"
PR = "9.el10"
PACKAGES = "easymock easymock-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/easymock-4.3-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_easymock = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/easymock-4.3-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_easymock}"
RDEPENDS:easymock = " \
 objectweb-asm \
 javapackages-filesystem \
 cglib \
 objenesis \
"

URI_easymock-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/easymock-javadoc-4.3-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_easymock-javadoc}"
RDEPENDS:easymock-javadoc = " \
 javapackages-filesystem \
"
