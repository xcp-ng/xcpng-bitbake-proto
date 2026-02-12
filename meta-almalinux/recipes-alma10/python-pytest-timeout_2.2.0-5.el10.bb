
inherit dnf-bridge

PN = "python-pytest-timeout"
PE = "0"
PV = "2.2.0"
PR = "5.el10"
PACKAGES = "python3-pytest-timeout"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-pytest-timeout-2.2.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pytest-timeout = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pytest-timeout-2.2.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pytest-timeout}"
RDEPENDS:python3-pytest-timeout = " \
 python3 \
 python3-pytest \
"
