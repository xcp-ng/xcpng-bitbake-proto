
inherit dnf-bridge

PN = "jdepend"
PE = "0"
PV = "2.10"
PR = "12.el10"
PACKAGES = "jdepend jdepend-javadoc"


URI_jdepend = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jdepend-2.10-12.el10.noarch.rpm;unpack=0"
RDEPENDS:jdepend = " \
 javapackages-filesystem \
"

URI_jdepend-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jdepend-javadoc-2.10-12.el10.noarch.rpm;unpack=0"
RDEPENDS:jdepend-javadoc = " \
 javapackages-filesystem \
"
