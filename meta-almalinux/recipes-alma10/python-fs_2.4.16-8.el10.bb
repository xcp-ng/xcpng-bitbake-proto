
inherit dnf-bridge

PN = "python-fs"
PE = "0"
PV = "2.4.16"
PR = "8.el10"
PACKAGES = "python3-fs"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-fs-2.4.16-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-fs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-fs-2.4.16-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-fs}"
RDEPENDS:python3-fs = " \
 python3-setuptools \
 python3-appdirs \
 python3-six \
 python3 \
"
