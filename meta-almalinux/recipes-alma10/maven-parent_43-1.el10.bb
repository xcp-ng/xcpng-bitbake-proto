
inherit dnf-bridge

PN = "maven-parent"
PE = "0"
PV = "43"
PR = "1.el10"
PACKAGES = "maven-parent"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-parent-43-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-parent-43-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-parent}"
RDEPENDS:maven-parent = " \
 maven-plugin-plugin \
 maven-enforcer-plugin \
 javapackages-filesystem \
 apache-parent \
"
