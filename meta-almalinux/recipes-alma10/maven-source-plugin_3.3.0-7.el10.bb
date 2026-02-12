
inherit dnf-bridge

PN = "maven-source-plugin"
PE = "0"
PV = "3.3.0"
PR = "7.el10"
PACKAGES = "maven-source-plugin maven-source-plugin-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-source-plugin-3.3.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-source-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-source-plugin-3.3.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-source-plugin}"
RDEPENDS:maven-source-plugin = " \
 plexus-archiver \
 plexus-utils \
 javapackages-filesystem \
 maven-archiver \
"

URI_maven-source-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-source-plugin-javadoc-3.3.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-source-plugin-javadoc}"
RDEPENDS:maven-source-plugin-javadoc = " \
 javapackages-filesystem \
"
