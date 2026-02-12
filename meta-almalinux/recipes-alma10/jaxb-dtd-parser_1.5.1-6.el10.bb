
inherit dnf-bridge

PN = "jaxb-dtd-parser"
PE = "0"
PV = "1.5.1"
PR = "6.el10"
PACKAGES = "jaxb-dtd-parser jaxb-dtd-parser-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jaxb-dtd-parser-1.5.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jaxb-dtd-parser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-dtd-parser-1.5.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jaxb-dtd-parser}"
RDEPENDS:jaxb-dtd-parser = " \
 javapackages-filesystem \
"

URI_jaxb-dtd-parser-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-dtd-parser-javadoc-1.5.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jaxb-dtd-parser-javadoc}"
RDEPENDS:jaxb-dtd-parser-javadoc = " \
 javapackages-filesystem \
"
