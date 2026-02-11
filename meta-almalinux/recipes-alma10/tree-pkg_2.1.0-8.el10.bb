
inherit dnf-bridge

PN = "tree-pkg"
PE = "0"
PV = "2.1.0"
PR = "8.el10"
PACKAGES = "tree"


URI_tree = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tree-2.1.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tree = " \
 glibc \
"
