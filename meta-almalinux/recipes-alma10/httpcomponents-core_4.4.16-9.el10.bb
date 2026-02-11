
PN = "httpcomponents-core"
PE = "0"
PV = "4.4.16"
PR = "9.el10"
PACKAGES = "httpcomponents-core httpcomponents-core-javadoc"


URI_httpcomponents-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpcomponents-core-4.4.16-9.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-core = "
 javapackages-filesystem
"

URI_httpcomponents-core-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/httpcomponents-core-javadoc-4.4.16-9.el10.noarch.rpm;unpack=0"
RDEPENDS:httpcomponents-core-javadoc = "
 javapackages-filesystem
"
