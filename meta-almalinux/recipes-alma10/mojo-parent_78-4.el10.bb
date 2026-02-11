
inherit dnf-bridge

PN = "mojo-parent"
PE = "0"
PV = "78"
PR = "4.el10"
PACKAGES = "mojo-parent"


URI_mojo-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mojo-parent-78-4.el10.noarch.rpm;unpack=0"
RDEPENDS:mojo-parent = " \
 maven-assembly-plugin \
 javapackages-filesystem \
"
