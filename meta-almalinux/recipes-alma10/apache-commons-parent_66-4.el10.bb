
inherit dnf-bridge

PN = "apache-commons-parent"
PE = "0"
PV = "66"
PR = "4.el10"
PACKAGES = "apache-commons-parent"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/apache-commons-parent-66-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_apache-commons-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-commons-parent-66-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-commons-parent}"
RDEPENDS:apache-commons-parent = " \
 maven-surefire-plugin \
 maven-jar-plugin \
 maven-antrun-plugin \
 javapackages-filesystem \
 maven-assembly-plugin \
 moditect \
 maven-bundle-plugin \
 maven-compiler-plugin \
 build-helper-maven-plugin \
 apache-parent \
"
