
inherit dnf-bridge

PN = "maven-shade-plugin"
PE = "0"
PV = "3.5.1"
PR = "4.el10"
PACKAGES = "maven-shade-plugin maven-shade-plugin-javadoc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/maven-shade-plugin-3.5.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-shade-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-shade-plugin-3.5.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-shade-plugin}"
RDEPENDS:maven-shade-plugin = " \
 jdom2 \
 objectweb-asm \
 apache-commons-io \
 plexus-utils \
 javapackages-filesystem \
 apache-commons-collections4 \
 slf4j \
 maven-dependency-tree \
 java-21-openjdk-headless \
 jdependency \
"

URI_maven-shade-plugin-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-shade-plugin-javadoc-3.5.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-shade-plugin-javadoc}"
RDEPENDS:maven-shade-plugin-javadoc = " \
 javapackages-filesystem \
"
