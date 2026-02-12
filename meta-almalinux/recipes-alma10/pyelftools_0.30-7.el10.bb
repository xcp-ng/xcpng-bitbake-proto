
inherit dnf-bridge

PN = "pyelftools"
PE = "0"
PV = "0.30"
PR = "7.el10"
PACKAGES = "python3-pyelftools"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/pyelftools-0.30-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyelftools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pyelftools-0.30-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pyelftools}"
RDEPENDS:python3-pyelftools = " \
 python3 \
"
