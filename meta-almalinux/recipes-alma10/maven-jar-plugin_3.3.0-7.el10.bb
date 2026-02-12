
inherit dnf-bridge

PN = "maven-jar-plugin"
PE = "0"
PV = "3.3.0"
PR = "7.el10"
PACKAGES = "maven-jar-plugin maven-jar-plugin-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-jar-plugin-3.3.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-jar-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-jar-plugin-3.3.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-jar-plugin}"
RDEPENDS:maven-jar-plugin = " \
 plexus-utils \
 javapackages-filesystem \
 maven-archiver \
 maven-file-management \
"

URI_maven-jar-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-jar-plugin-javadoc-3.3.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-jar-plugin-javadoc}"
RDEPENDS:maven-jar-plugin-javadoc = " \
 javapackages-filesystem \
"
