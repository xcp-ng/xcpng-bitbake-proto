
inherit dnf-bridge

PN = "python-sphinxcontrib-jquery"
PE = "0"
PV = "4.1"
PR = "9.el10"
PACKAGES = "python3-sphinxcontrib-jquery"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-sphinxcontrib-jquery-4.1-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-sphinxcontrib-jquery = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-sphinxcontrib-jquery-4.1-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-sphinxcontrib-jquery}"
RDEPENDS:python3-sphinxcontrib-jquery = " \
 python3 \
 python3-sphinx \
"
