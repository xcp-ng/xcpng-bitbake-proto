
inherit dnf-bridge

PN = "mm-common"
PE = "0"
PV = "1.0.6"
PR = "6.el10"
PACKAGES = "mm-common mm-common-docs"


URI_mm-common = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mm-common-1.0.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mm-common = " \
 python3 \
 libxslt \
 pkgconf-pkg-config \
 doxygen \
 bash \
 graphviz \
"

URI_mm-common-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mm-common-docs-1.0.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mm-common-docs = " \
 mm-common \
"
