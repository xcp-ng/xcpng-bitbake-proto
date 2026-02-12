
inherit dnf-bridge

PN = "python-lesscpy"
PE = "0"
PV = "0.14.0"
PR = "17.el10"
PACKAGES = "python3-lesscpy"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-lesscpy-0.14.0-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-lesscpy = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-lesscpy-0.14.0-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-lesscpy}"
RDEPENDS:python3-lesscpy = " \
 python3 \
 python3-six \
 python3-ply \
"
