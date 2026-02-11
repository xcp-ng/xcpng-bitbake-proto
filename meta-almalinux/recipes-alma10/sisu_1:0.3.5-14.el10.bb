
inherit dnf-bridge

PN = "sisu"
PE = "1"
PV = "0.3.5"
PR = "14.el10"
PACKAGES = "sisu sisu-javadoc"


URI_sisu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sisu-0.3.5-14.el10.noarch.rpm;unpack=0"
RDEPENDS:sisu = " \
 plexus-classworlds \
 plexus-containers-component-annotations \
 plexus-utils \
 javapackages-filesystem \
 cdi-api \
"

URI_sisu-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sisu-javadoc-0.3.5-14.el10.noarch.rpm;unpack=0"
RDEPENDS:sisu-javadoc = " \
 javapackages-filesystem \
"
