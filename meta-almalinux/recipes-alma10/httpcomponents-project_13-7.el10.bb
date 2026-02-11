
inherit dnf-bridge

PN = "httpcomponents-project"
PE = "0"
PV = "13"
PR = "7.el10"
PACKAGES = "httpcomponents-project"


URI_httpcomponents-project = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/httpcomponents-project-13-7.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-project = " \
 maven-jar-plugin \
 javapackages-filesystem \
 apache-parent \
"
