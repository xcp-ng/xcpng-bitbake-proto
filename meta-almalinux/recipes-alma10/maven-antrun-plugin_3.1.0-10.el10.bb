
inherit dnf-bridge

PN = "maven-antrun-plugin"
PE = "0"
PV = "3.1.0"
PR = "10.el10"
PACKAGES = "maven-antrun-plugin maven-antrun-plugin-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-antrun-plugin-3.1.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-antrun-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-antrun-plugin-3.1.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-antrun-plugin}"
RDEPENDS:maven-antrun-plugin = " \
 ant-lib \
 plexus-utils \
 javapackages-filesystem \
"

URI_maven-antrun-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-antrun-plugin-javadoc-3.1.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-antrun-plugin-javadoc}"
RDEPENDS:maven-antrun-plugin-javadoc = " \
 javapackages-filesystem \
"
