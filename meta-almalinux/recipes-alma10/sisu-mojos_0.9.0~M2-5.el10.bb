
inherit dnf-bridge

PN = "sisu-mojos"
PE = "0"
PV = "0.9.0~M2"
PR = "5.el10"
PACKAGES = "sisu-mojos sisu-mojos-javadoc"


URI_sisu-mojos = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sisu-mojos-0.9.0~M2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:sisu-mojos = " \
 plexus-utils \
 javapackages-filesystem \
 sisu \
 maven-common-artifact-filters \
 plexus-build-api0 \
 slf4j \
"

URI_sisu-mojos-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sisu-mojos-javadoc-0.9.0~M2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:sisu-mojos-javadoc = " \
 javapackages-filesystem \
"
