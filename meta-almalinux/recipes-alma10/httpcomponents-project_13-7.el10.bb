
inherit dnf-bridge

PN = "httpcomponents-project"
PE = "0"
PV = "13"
PR = "7.el10"
PACKAGES = "httpcomponents-project"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/httpcomponents-project-13-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_httpcomponents-project = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/httpcomponents-project-13-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_httpcomponents-project}"
RDEPENDS:httpcomponents-project = " \
 maven-jar-plugin \
 javapackages-filesystem \
 apache-parent \
"
