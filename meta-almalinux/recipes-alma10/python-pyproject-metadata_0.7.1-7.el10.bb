
inherit dnf-bridge

PN = "python-pyproject-metadata"
PE = "0"
PV = "0.7.1"
PR = "7.el10"
PACKAGES = "python3-pyproject-metadata"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-pyproject-metadata-0.7.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyproject-metadata = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pyproject-metadata-0.7.1-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pyproject-metadata}"
RDEPENDS:python3-pyproject-metadata = " \
 python3 \
 python3-packaging \
"
