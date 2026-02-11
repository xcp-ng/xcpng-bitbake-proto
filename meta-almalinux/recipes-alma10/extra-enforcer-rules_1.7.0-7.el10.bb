
inherit dnf-bridge

PN = "extra-enforcer-rules"
PE = "0"
PV = "1.7.0"
PR = "7.el10"
PACKAGES = "extra-enforcer-rules extra-enforcer-rules-javadoc"


URI_extra-enforcer-rules = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/extra-enforcer-rules-1.7.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:extra-enforcer-rules = " \
 apache-commons-codec \
 javapackages-filesystem \
 maven-common-artifact-filters \
 maven-dependency-tree \
"

URI_extra-enforcer-rules-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/extra-enforcer-rules-javadoc-1.7.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:extra-enforcer-rules-javadoc = " \
 javapackages-filesystem \
"
