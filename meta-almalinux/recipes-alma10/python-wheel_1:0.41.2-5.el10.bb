
inherit dnf-bridge

PN = "python-wheel"
PE = "1"
PV = "0.41.2"
PR = "5.el10"
PACKAGES = "python3-wheel python3-wheel-wheel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-wheel-0.41.2-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-wheel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-wheel-0.41.2-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-wheel}"
RDEPENDS:python3-wheel = " \
 python3 \
"

URI_python3-wheel-wheel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-wheel-wheel-0.41.2-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-wheel-wheel}"
RDEPENDS:python3-wheel-wheel = ""
