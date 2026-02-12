
inherit dnf-bridge

PN = "python-setuptools"
PE = "0"
PV = "69.0.3"
PR = "12.el10_0"
PACKAGES = "python3-setuptools python3-setuptools-wheel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-setuptools-69.0.3-12.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-setuptools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-setuptools-69.0.3-12.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-setuptools}"
RDEPENDS:python3-setuptools = " \
 python3 \
"

URI_python3-setuptools-wheel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-setuptools-wheel-69.0.3-12.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-setuptools-wheel}"
RDEPENDS:python3-setuptools-wheel = ""
