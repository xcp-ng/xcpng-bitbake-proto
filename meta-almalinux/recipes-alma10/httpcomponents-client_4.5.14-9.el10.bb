
inherit dnf-bridge

PN = "httpcomponents-client"
PE = "0"
PV = "4.5.14"
PR = "9.el10"
PACKAGES = "httpcomponents-client httpcomponents-client-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/httpcomponents-client-4.5.14-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_httpcomponents-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpcomponents-client-4.5.14-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_httpcomponents-client}"
RDEPENDS:httpcomponents-client = " \
 publicsuffix-list \
 apache-commons-codec \
 httpcomponents-core \
 javapackages-filesystem \
"

URI_httpcomponents-client-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/httpcomponents-client-javadoc-4.5.14-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_httpcomponents-client-javadoc}"
RDEPENDS:httpcomponents-client-javadoc = " \
 javapackages-filesystem \
"
