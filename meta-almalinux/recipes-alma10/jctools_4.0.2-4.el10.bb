
inherit dnf-bridge

PN = "jctools"
PE = "0"
PV = "4.0.2"
PR = "4.el10"
PACKAGES = "jctools jctools-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jctools-4.0.2-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jctools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jctools-4.0.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jctools}"
RDEPENDS:jctools = " \
 javapackages-filesystem \
"

URI_jctools-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jctools-javadoc-4.0.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jctools-javadoc}"
RDEPENDS:jctools-javadoc = " \
 javapackages-filesystem \
"
