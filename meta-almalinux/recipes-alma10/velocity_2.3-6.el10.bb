
inherit dnf-bridge

PN = "velocity"
PE = "0"
PV = "2.3"
PR = "6.el10"
PACKAGES = "velocity velocity-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/velocity-2.3-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_velocity = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/velocity-2.3-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_velocity}"
RDEPENDS:velocity = " \
 apache-commons-io \
 javapackages-filesystem \
 apache-commons-lang3 \
 slf4j \
"

URI_velocity-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/velocity-javadoc-2.3-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_velocity-javadoc}"
RDEPENDS:velocity-javadoc = " \
 javapackages-filesystem \
"
