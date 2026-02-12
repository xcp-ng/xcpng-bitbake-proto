
inherit dnf-bridge

PN = "python-pytest-subtests"
PE = "0"
PV = "0.10.0"
PR = "7.el10"
PACKAGES = "python3-pytest-subtests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-pytest-subtests-0.10.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pytest-subtests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pytest-subtests-0.10.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pytest-subtests}"
RDEPENDS:python3-pytest-subtests = " \
 python3 \
 python3-attrs \
 python3-pytest \
"
