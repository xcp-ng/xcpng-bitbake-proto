
PN = "javaparser"
PE = "0"
PV = "3.25.6"
PR = "7.el10"
PACKAGES = "javaparser javaparser-javadoc"


URI_javaparser = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javaparser-3.25.6-7.el10.noarch.rpm;unpack=0"
RDEPENDS:javaparser = " \
 javapackages-filesystem \
"

URI_javaparser-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javaparser-javadoc-3.25.6-7.el10.noarch.rpm;unpack=0"
RDEPENDS:javaparser-javadoc = " \
 javapackages-filesystem \
"
