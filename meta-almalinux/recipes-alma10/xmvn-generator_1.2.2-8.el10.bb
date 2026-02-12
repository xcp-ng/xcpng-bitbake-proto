
inherit dnf-bridge

PN = "xmvn-generator"
PE = "0"
PV = "1.2.2"
PR = "8.el10"
PACKAGES = "xmvn-generator xmvn-generator-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/xmvn-generator-1.2.2-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xmvn-generator = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-generator-1.2.2-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xmvn-generator}"
RDEPENDS:xmvn-generator = " \
 objectweb-asm \
 apache-commons-compress \
 javapackages-filesystem \
 rpm-build \
 java-21-openjdk-headless \
 lujavrite \
"

URI_xmvn-generator-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmvn-generator-javadoc-1.2.2-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmvn-generator-javadoc}"
RDEPENDS:xmvn-generator-javadoc = " \
 javapackages-filesystem \
"
