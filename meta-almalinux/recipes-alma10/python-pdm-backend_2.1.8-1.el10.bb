
inherit dnf-bridge

PN = "python-pdm-backend"
PE = "0"
PV = "2.1.8"
PR = "1.el10"
PACKAGES = "python3-pdm-backend"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-pdm-backend-2.1.8-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pdm-backend = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pdm-backend-2.1.8-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pdm-backend}"
RDEPENDS:python3-pdm-backend = " \
 python3 \
 python3-packaging \
 python3-tomli-w \
 python3-pyproject-metadata \
"
