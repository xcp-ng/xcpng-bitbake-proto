
inherit dnf-bridge

PN = "python-kdcproxy"
PE = "0"
PV = "1.0.0"
PR = "18.el10"
PACKAGES = "python3-kdcproxy"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-kdcproxy-1.0.0-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-kdcproxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-kdcproxy-1.0.0-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-kdcproxy}"
RDEPENDS:python3-kdcproxy = " \
 python3-pyasn1 \
 python3-dns \
 python3 \
"
