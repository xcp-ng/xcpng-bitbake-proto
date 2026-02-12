
inherit dnf-bridge

PN = "maven-assembly-plugin"
PE = "0"
PV = "3.6.0"
PR = "7.el10"
PACKAGES = "maven-assembly-plugin maven-assembly-plugin-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-assembly-plugin-3.6.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-assembly-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-assembly-plugin-3.6.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-assembly-plugin}"
RDEPENDS:maven-assembly-plugin = " \
 maven-filtering \
 plexus-interpolation \
 apache-commons-io \
 plexus-utils \
 javapackages-filesystem \
 maven-archiver \
 maven-common-artifact-filters \
 plexus-archiver \
 plexus-io \
"

URI_maven-assembly-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-assembly-plugin-javadoc-3.6.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-assembly-plugin-javadoc}"
RDEPENDS:maven-assembly-plugin-javadoc = " \
 javapackages-filesystem \
"
