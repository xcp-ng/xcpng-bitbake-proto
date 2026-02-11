
PN = "apache-parent"
PE = "0"
PV = "33"
PR = "1.el10"
PACKAGES = "apache-parent"


URI_apache-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/apache-parent-33-1.el10.noarch.rpm;unpack=0"
RDEPENDS:apache-parent = "
 maven-remote-resources-plugin
 maven-enforcer-plugin
 javapackages-filesystem
 apache-resource-bundles
"
