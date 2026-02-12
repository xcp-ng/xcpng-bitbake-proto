
inherit dnf-bridge

PN = "python-iniconfig"
PE = "0"
PV = "1.1.1"
PR = "18.el10"
PACKAGES = "python3-iniconfig"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-iniconfig-1.1.1-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-iniconfig = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-iniconfig-1.1.1-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-iniconfig}"
RDEPENDS:python3-iniconfig = " \
 python3 \
"
