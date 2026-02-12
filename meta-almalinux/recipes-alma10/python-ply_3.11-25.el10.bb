
inherit dnf-bridge

PN = "python-ply"
PE = "0"
PV = "3.11"
PR = "25.el10"
PACKAGES = "python3-ply"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-ply-3.11-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-ply = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-ply-3.11-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-ply}"
RDEPENDS:python3-ply = " \
 python3 \
"
