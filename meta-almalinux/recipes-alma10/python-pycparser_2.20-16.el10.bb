
inherit dnf-bridge

PN = "python-pycparser"
PE = "0"
PV = "2.20"
PR = "16.el10"
PACKAGES = "python3-pycparser"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-pycparser-2.20-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pycparser = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pycparser-2.20-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pycparser}"
RDEPENDS:python3-pycparser = " \
 python3 \
 python3-ply \
"
