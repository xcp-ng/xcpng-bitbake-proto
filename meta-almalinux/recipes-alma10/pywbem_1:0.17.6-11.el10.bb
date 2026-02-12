
inherit dnf-bridge

PN = "pywbem"
PE = "1"
PV = "0.17.6"
PR = "11.el10"
PACKAGES = "python3-pywbem"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/pywbem-0.17.6-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pywbem = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pywbem-0.17.6-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pywbem}"
RDEPENDS:python3-pywbem = " \
 python3 \
 python3-pyyaml \
 python3-six \
 python3-ply \
"
