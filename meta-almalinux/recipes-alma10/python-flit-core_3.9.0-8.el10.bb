
inherit dnf-bridge

PN = "python-flit-core"
PE = "0"
PV = "3.9.0"
PR = "8.el10"
PACKAGES = "python3-flit-core"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-flit-core-3.9.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-flit-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-flit-core-3.9.0-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-flit-core}"
RDEPENDS:python3-flit-core = " \
 python3 \
"
