
PN = "aqute-bnd"
PE = "0"
PV = "6.3.1"
PR = "11.el10"
PACKAGES = "aqute-bnd aqute-bnd-javadoc aqute-bndlib"


URI_aqute-bnd = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aqute-bnd-6.3.1-11.el10.noarch.rpm;unpack=0"
RDEPENDS:aqute-bnd = " \
 aqute-bndlib \
 javapackages-filesystem \
 javapackages-tools \
 bash \
 slf4j \
 ant-lib \
 osgi-annotation \
"

URI_aqute-bnd-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aqute-bnd-javadoc-6.3.1-11.el10.noarch.rpm;unpack=0"
RDEPENDS:aqute-bnd-javadoc = " \
 javapackages-filesystem \
"

URI_aqute-bndlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/aqute-bndlib-6.3.1-11.el10.noarch.rpm;unpack=0"
RDEPENDS:aqute-bndlib = " \
 javapackages-filesystem \
 slf4j \
 osgi-annotation \
 osgi-compendium \
 aqute-bnd \
 osgi-core \
"
