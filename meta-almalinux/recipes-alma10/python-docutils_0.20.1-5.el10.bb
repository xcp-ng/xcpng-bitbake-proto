
inherit dnf-bridge

PN = "python-docutils"
PE = "0"
PV = "0.20.1"
PR = "5.el10"
PACKAGES = "python3-docutils"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-docutils-0.20.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-docutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-docutils-0.20.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-docutils}"
RDEPENDS:python3-docutils = " \
 python3 \
"
