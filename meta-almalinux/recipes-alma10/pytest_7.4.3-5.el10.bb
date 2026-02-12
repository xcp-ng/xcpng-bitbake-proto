
inherit dnf-bridge

PN = "pytest"
PE = "0"
PV = "7.4.3"
PR = "5.el10"
PACKAGES = "python3-pytest"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/pytest-7.4.3-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pytest = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pytest-7.4.3-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pytest}"
RDEPENDS:python3-pytest = " \
 python3 \
 python3-packaging \
 python3-iniconfig \
 python3-pluggy \
"
