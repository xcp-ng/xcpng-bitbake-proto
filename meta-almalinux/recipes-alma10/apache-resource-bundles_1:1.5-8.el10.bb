
inherit dnf-bridge

PN = "apache-resource-bundles"
PE = "1"
PV = "1.5"
PR = "8.el10"
PACKAGES = "apache-resource-bundles"


URI_apache-resource-bundles = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-resource-bundles-1.5-8.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-resource-bundles = " \
 javapackages-filesystem \
"
