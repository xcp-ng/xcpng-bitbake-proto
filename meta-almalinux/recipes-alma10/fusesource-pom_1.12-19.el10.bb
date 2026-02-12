
inherit dnf-bridge

PN = "fusesource-pom"
PE = "0"
PV = "1.12"
PR = "19.el10"
PACKAGES = "fusesource-pom"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/fusesource-pom-1.12-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fusesource-pom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fusesource-pom-1.12-19.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_fusesource-pom}"
RDEPENDS:fusesource-pom = " \
 javapackages-filesystem \
"
