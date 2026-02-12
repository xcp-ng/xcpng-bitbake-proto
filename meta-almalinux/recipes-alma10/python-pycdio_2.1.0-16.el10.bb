
inherit dnf-bridge

PN = "python-pycdio"
PE = "0"
PV = "2.1.0"
PR = "16.el10"
PACKAGES = "python3-pycdio"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-pycdio-2.1.0-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pycdio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pycdio-2.1.0-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-pycdio}"
RDEPENDS:python3-pycdio = " \
 glibc \
 libcdio \
 python3 \
"
