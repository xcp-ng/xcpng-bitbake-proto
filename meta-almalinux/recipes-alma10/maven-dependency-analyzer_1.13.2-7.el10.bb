
inherit dnf-bridge

PN = "maven-dependency-analyzer"
PE = "0"
PV = "1.13.2"
PR = "7.el10"
PACKAGES = "maven-dependency-analyzer maven-dependency-analyzer-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-dependency-analyzer-1.13.2-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-dependency-analyzer = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-analyzer-1.13.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-dependency-analyzer}"
RDEPENDS:maven-dependency-analyzer = " \
 objectweb-asm \
 atinject \
 apache-commons-io \
 javapackages-filesystem \
 slf4j \
 maven-lib \
"

URI_maven-dependency-analyzer-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-dependency-analyzer-javadoc-1.13.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-dependency-analyzer-javadoc}"
RDEPENDS:maven-dependency-analyzer-javadoc = " \
 javapackages-filesystem \
"
