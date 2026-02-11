
PN = "java_cup"
PE = "1"
PV = "0.11b"
PR = "30.el10"
PACKAGES = "java_cup java_cup-javadoc java_cup-manual"


URI_java_cup = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java_cup-0.11b-30.el10.noarch.rpm;unpack=0"
RDEPENDS:java_cup = " \
 bash \
 javapackages-filesystem \
 javapackages-tools \
"

URI_java_cup-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java_cup-javadoc-0.11b-30.el10.noarch.rpm;unpack=0"
RDEPENDS:java_cup-javadoc = " \
 javapackages-filesystem \
"

URI_java_cup-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/java_cup-manual-0.11b-30.el10.noarch.rpm;unpack=0"
RDEPENDS:java_cup-manual = ""
