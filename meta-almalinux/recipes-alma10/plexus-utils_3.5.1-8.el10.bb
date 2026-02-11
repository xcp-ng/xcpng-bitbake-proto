
PN = "plexus-utils"
PE = "0"
PV = "3.5.1"
PR = "8.el10"
PACKAGES = "plexus-utils plexus-utils-javadoc"


URI_plexus-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plexus-utils-3.5.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-utils = " \
 javapackages-filesystem \
"

URI_plexus-utils-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-utils-javadoc-3.5.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-utils-javadoc = " \
 javapackages-filesystem \
"
