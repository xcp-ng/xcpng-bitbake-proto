
inherit dnf-bridge

PN = "pyxattr"
PE = "0"
PV = "0.7.2"
PR = "14.el10"
PACKAGES = "python3-pyxattr"


URI_python3-pyxattr = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pyxattr-0.7.2-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pyxattr = " \
 glibc \
 python3 \
"
