
inherit dnf-bridge

PN = "jboss-parent"
PE = "0"
PV = "20"
PR = "21.el10"
PACKAGES = "jboss-parent"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jboss-parent-20-21.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jboss-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-parent-20-21.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jboss-parent}"
RDEPENDS:jboss-parent = " \
 maven-source-plugin \
 javapackages-filesystem \
 java-21-openjdk-headless \
"
