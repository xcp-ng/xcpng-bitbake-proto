
inherit dnf-bridge

PN = "python-pyproject-hooks"
PE = "0"
PV = "1.0.0"
PR = "16.el10"
PACKAGES = "python3-pyproject-hooks"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-pyproject-hooks-1.0.0-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyproject-hooks = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pyproject-hooks-1.0.0-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pyproject-hooks}"
RDEPENDS:python3-pyproject-hooks = " \
 python3 \
"
