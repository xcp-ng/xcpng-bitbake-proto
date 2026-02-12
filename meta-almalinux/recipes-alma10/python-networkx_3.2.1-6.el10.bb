
inherit dnf-bridge

PN = "python-networkx"
PE = "0"
PV = "3.2.1"
PR = "6.el10"
PACKAGES = "python3-networkx"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-networkx-3.2.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-networkx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-networkx-3.2.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-networkx}"
RDEPENDS:python3-networkx = " \
 python3 \
"
