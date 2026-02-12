
inherit dnf-bridge

PN = "python-pygments"
PE = "0"
PV = "2.18.0"
PR = "1.el10"
PACKAGES = "python3-pygments"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-pygments-2.18.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pygments = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pygments-2.18.0-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pygments}"
RDEPENDS:python3-pygments = " \
 python3 \
"
