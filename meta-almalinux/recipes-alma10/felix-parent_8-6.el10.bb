
inherit dnf-bridge

PN = "felix-parent"
PE = "0"
PV = "8"
PR = "6.el10"
PACKAGES = "felix-parent"


URI_felix-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/felix-parent-8-6.el10.noarch.rpm;unpack=0"
RDEPENDS:felix-parent = " \
 javapackages-filesystem \
 apache-parent \
"
