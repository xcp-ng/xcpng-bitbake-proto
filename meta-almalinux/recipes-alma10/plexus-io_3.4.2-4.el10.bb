
PN = "plexus-io"
PE = "0"
PV = "3.4.2"
PR = "4.el10"
PACKAGES = "plexus-io plexus-io-javadoc"


URI_plexus-io = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-io-3.4.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-io = " \
 plexus-utils \
 apache-commons-io \
 javapackages-filesystem \
 atinject \
"

URI_plexus-io-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-io-javadoc-3.4.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-io-javadoc = " \
 javapackages-filesystem \
"
