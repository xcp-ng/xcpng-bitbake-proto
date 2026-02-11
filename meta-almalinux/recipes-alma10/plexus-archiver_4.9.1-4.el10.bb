
inherit dnf-bridge

PN = "plexus-archiver"
PE = "0"
PV = "4.9.1"
PR = "4.el10"
PACKAGES = "plexus-archiver plexus-archiver-javadoc"


URI_plexus-archiver = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-archiver-4.9.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-archiver = " \
 atinject \
 xz-java \
 apache-commons-compress \
 apache-commons-io \
 plexus-utils \
 javapackages-filesystem \
 slf4j \
 plexus-io \
"

URI_plexus-archiver-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-archiver-javadoc-4.9.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:plexus-archiver-javadoc = " \
 javapackages-filesystem \
"
