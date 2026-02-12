
inherit dnf-bridge

PN = "Cython"
PE = "0"
PV = "3.0.9"
PR = "8.el10"
PACKAGES = "python3-cython"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/Cython-3.0.9-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-cython = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-cython-3.0.9-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-cython}"
RDEPENDS:python3-cython = " \
 glibc \
 python3 \
"
