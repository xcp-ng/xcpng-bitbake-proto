
inherit dnf-bridge

PN = "cdi-api"
PE = "0"
PV = "2.0.2"
PR = "15.el10"
PACKAGES = "cdi-api cdi-api-javadoc"


URI_cdi-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cdi-api-2.0.2-15.el10.noarch.rpm;unpack=0"
RDEPENDS:cdi-api = " \
 atinject \
 javapackages-filesystem \
"

URI_cdi-api-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cdi-api-javadoc-2.0.2-15.el10.noarch.rpm;unpack=0"
RDEPENDS:cdi-api-javadoc = " \
 javapackages-filesystem \
"
