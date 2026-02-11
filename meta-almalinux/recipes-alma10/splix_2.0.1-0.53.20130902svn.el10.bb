
inherit dnf-bridge

PN = "splix"
PE = "0"
PV = "2.0.1"
PR = "0.53.20130902svn.el10"
PACKAGES = "splix"


URI_splix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/splix-2.0.1-0.53.20130902svn.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:splix = " \
 libgcc \
 cups-libs \
 cups \
 libstdc++ \
 jbigkit-libs \
 glibc \
"
