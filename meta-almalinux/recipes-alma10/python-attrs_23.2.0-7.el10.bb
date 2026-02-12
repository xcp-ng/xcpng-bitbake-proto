
inherit dnf-bridge

PN = "python-attrs"
PE = "0"
PV = "23.2.0"
PR = "7.el10"
PACKAGES = "python3-attrs"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-attrs-23.2.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-attrs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-attrs-23.2.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-attrs}"
RDEPENDS:python3-attrs = " \
 python3 \
"
