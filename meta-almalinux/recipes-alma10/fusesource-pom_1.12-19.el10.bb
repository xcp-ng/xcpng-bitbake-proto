
inherit dnf-bridge

PN = "fusesource-pom"
PE = "0"
PV = "1.12"
PR = "19.el10"
PACKAGES = "fusesource-pom"


URI_fusesource-pom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fusesource-pom-1.12-19.el10.noarch.rpm;unpack=0"
RDEPENDS:fusesource-pom = " \
 javapackages-filesystem \
"
