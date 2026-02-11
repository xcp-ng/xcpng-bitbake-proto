
PN = "jflex"
PE = "0"
PV = "1.7.0"
PR = "19.el10"
PACKAGES = "jflex jflex-javadoc"


URI_jflex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jflex-1.7.0-19.el10.noarch.rpm;unpack=0"
RDEPENDS:jflex = "
 javapackages-filesystem
 javapackages-tools
 bash
 ant-lib
 java_cup
"

URI_jflex-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jflex-javadoc-1.7.0-19.el10.noarch.rpm;unpack=0"
RDEPENDS:jflex-javadoc = "
 javapackages-filesystem
"
