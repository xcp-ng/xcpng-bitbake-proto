
inherit dnf-bridge

PN = "felix-parent"
PE = "0"
PV = "8"
PR = "6.el10"
PACKAGES = "felix-parent"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/felix-parent-8-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_felix-parent = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/felix-parent-8-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_felix-parent}"
RDEPENDS:felix-parent = " \
 javapackages-filesystem \
 apache-parent \
"
