
inherit dnf-bridge

PN = "jflex"
PE = "0"
PV = "1.7.0"
PR = "19.el10"
PACKAGES = "jflex jflex-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/jflex-1.7.0-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jflex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jflex-1.7.0-19.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jflex}"
RDEPENDS:jflex = " \
 javapackages-filesystem \
 javapackages-tools \
 bash \
 ant-lib \
 java_cup \
"

URI_jflex-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jflex-javadoc-1.7.0-19.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jflex-javadoc}"
RDEPENDS:jflex-javadoc = " \
 javapackages-filesystem \
"
