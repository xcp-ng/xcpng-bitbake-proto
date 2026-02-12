
inherit dnf-bridge

PN = "jdepend"
PE = "0"
PV = "2.10"
PR = "12.el10"
PACKAGES = "jdepend jdepend-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jdepend-2.10-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jdepend = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jdepend-2.10-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jdepend}"
RDEPENDS:jdepend = " \
 javapackages-filesystem \
"

URI_jdepend-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jdepend-javadoc-2.10-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jdepend-javadoc}"
RDEPENDS:jdepend-javadoc = " \
 javapackages-filesystem \
"
