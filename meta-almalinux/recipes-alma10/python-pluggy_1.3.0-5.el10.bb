
inherit dnf-bridge

PN = "python-pluggy"
PE = "0"
PV = "1.3.0"
PR = "5.el10"
PACKAGES = "python3-pluggy"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-pluggy-1.3.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pluggy = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pluggy-1.3.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pluggy}"
RDEPENDS:python3-pluggy = " \
 python3 \
"
